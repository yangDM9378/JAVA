public class Ex7_7_polymorphism {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        fe.water();
//        car = fe;
////        car.water(); // 에러 Car타입의 참조변수인 car로는 water() 사용 불가
//        fe2 = (FireEngine)car;
//        fe2.water();
//
//        Car car = null;
//        FireEngine fe = null;
//        FireEngine fe2 = (FireEngine)null;
//        Car car2 = (Car)null;
////        car2.drive() // NullPointerException발생
//
//        Car c = new Car();
////        FireEngine fe = (FireEngine)c; // 형변환 에러 java.lang.ClassCastException -> 인스턴스 갯수가 넘어섬
//        fe.water();
    }
}

class Car1 {
    String color;
    int door;
    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car1 {
    void water() {
        System.out.println("water");
    }
}