public class Ex7_15_InnerClass2 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100; // 에러 static 변수 선언 x
        final static int CONST = 100; // final static 은 상수로 허용
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300; // 에러 static변수를 선언 불가
            final static int CONST = 300; // final static은 상수로 허용
        }

        int i = LocalInner.CONST;
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST); // 에러 지역 내부 클래스는 메서드 내에서만 가능
    }

}
