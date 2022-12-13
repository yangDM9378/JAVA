abstract class Unit2 {
    int x, y;
    abstract void move (int x, int y);
    void stop() { System.out.println("멈추기");}
}

interface Fightable {
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"] 이동");
    }
    public void attack(Fightable f) {
        System.out.println(f+"공격");
    }
    Fightable getFightable(){
        Fighter f = new Fighter(); // Fighter를 생성해서 반환
        return f;
    }
}

public class Ex7_12_interface {
    public static void main(String[] args) {
//        Fighter f = new Fighter();
        Unit2 u = new Fighter();
        u.move(100, 200);
//        u.attack(new Fighter()); // Unit2에서는 attack()이 없어 호출 불가
        u.stop();

        Fightable f = new Fighter();
        f.move(100,200);
        f.attack(new Fighter());
//        f.stop(); //Fightable에는 stop()이 없어 호출 불가

        Fighter fi = new Fighter();
        Fightable fi2 = fi.getFightable();
    }
}
