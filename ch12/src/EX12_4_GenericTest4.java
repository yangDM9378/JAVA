import java.util.*;

public class EX12_4_GenericTest4 {
    public static void main(String[] args) {
        HashMap<String, Student> map  = new HashMap<>();
        map.put("자바왕", new Student("자바왕",1,1,100,100,100));

        Student s = map.get("자바왕");

        System.out.println(map);
    }
}
class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}