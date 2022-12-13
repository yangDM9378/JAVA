class Ex7_16_Outer {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private 멤버도 접근가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv; // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근 불가
        static int scv = outerCv;
    }

    void myMethod() {
        final int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
//            외부 클래스의 지역변수는 final이 붙은 변수만 접근가능
            int liv3 = lv;
            int liv4 = LV;
        }
    }

}
