class AAA {
    int i = 100;
    BBB b = new BBB();
    class BBB {
        void method() {
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); // 객체 생성 없이 외부 클래스의 멤버 접근 가능
        }
    }
}

// class CCC {
//    BBB b = new BBB();
//}

public class Ex7_14_InnerClass {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method();
    }
}
