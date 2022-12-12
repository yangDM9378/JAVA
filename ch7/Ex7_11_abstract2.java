public class Ex7_11_abstract2 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new DropShip() };
        group[0].move(100,200);
        group[1].move(100,200);
        group[2].move(100,200);
    }
}

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marin");
    }
    void stimPack() {}
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank");
    }
    void stimPack() {}
}
class DropShip extends Unit {
    void move(int x, int y) {
        System.out.println("DropShip");
    }
    void stimPack() {}
}