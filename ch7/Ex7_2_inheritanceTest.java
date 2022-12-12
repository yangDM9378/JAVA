class MyPoint extends Object {
    int x;
    int y;
}

class Circle extends Object { // 포함
    MyPoint p = new MyPoint();
    int r;
    Circle() {
        p = new MyPoint();
    }
}

public class Ex7_2_inheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.p.x="+c.p.x);
        System.out.println("c.p.y="+c.p.y);
        System.out.println("c.r="+c.r);
        System.out.println(c.toString());
    }
}

//class Circle extends MyPoint { // 상속
//    int r;
//}
//
//public class Ex7_2_inheritanceTest {
//    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.x = 1;
//        c.y = 2;
//        c.r = 3;
//        System.out.println("c.x="+c.x);
//        System.out.println("c.y="+c.y);
//        System.out.println("c.r="+c.r);
//    }
//}
