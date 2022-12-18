import java.util.HashSet;
import java.util.Objects;

public class Ex11_9_HashSet1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));
        System.out.println(set);
    }
}

// equals()와 hashCode() 오버라이딩해야 HashSet이 바르게 동작
class Person {
    String name;
    int age;

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        // 나자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
}
