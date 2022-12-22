import java.util.*;
import java.util.stream.*;

public class Ex14_11_SortedComparing {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바",3,300),
                new Student("김자바",6,200),
                new Student("박자바",1,100),
                new Student("소자바",2,200),
                new Student("나자바",3,920),
                new Student("가자바",3,300)
            );
        studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
                .thenComparing(Comparator.naturalOrder())) // 기본정렬
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s,%d,%d]", name, ban, totalScore);
    }

    String getName() { return name; }
    int getBan() { return ban; }
    int getTotalScore() { return totalScore; };

    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}