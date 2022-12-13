
class A {
    public void methodA(I i) {
        i.methodB();
    }
}
// 선언과 구현 분리
interface I { void methodB(); }

class B implements I{
    public void methodB() {
        System.out.println("B");
    }
}

//class C implements I{
//
//    public void method() {
//        System.out.println("C");
//    }
//}


class Ex7_13_interface2 {
    public static void main (String args[]) {
        A a = new A();
        a.methodA(new B());
    }
}
