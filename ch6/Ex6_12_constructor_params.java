class Car {
    String color;
    String gearType;
    int door;

    Car() {} //기본 생성자
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class Ex6_12_constructor_params {
    public static void main(String[] args) {
        Car c = new Car("White", "auto",4);
        System.out.println(c.color);
        System.out.println(c.gearType);
        System.out.println(c.door);

        Car a = new Car("blue", "auto", 3);
        System.out.println(a.color);
        System.out.println(a.gearType);
        System.out.println(a.door);
    }
}
