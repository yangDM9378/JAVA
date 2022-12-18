
class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Overrides
    @Deprecated
    void parentMethod() { }
}
@FunctionalInterface
interface Testable {
    void test();
//    void check();
}

public class Ex12_7_Annotation {
    public static void main(String[] args) {
        Child c =new Child();
        c.parentMethod(); //Deprecated 메서드 사용
    }
}
