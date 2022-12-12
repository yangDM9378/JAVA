class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() { super(200); }

    public String toString() { return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족함");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() +"을 구입하셧습니다");
    }
}

class Ex7_8_param_polymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Tv1();
        b.buy(p);
//        b.buy(new Tv1());
        b.buy(new Computer());
    }
}
