public class Ex6_5_math {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.substract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5L, 3L);
        long result6 = mm.min(5L, 3L);
        mm.printGugudan(12);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}

class MyMath {
    void printGugudan(int dan) {
        if(!(2<=dan && dan<=9))
            return;
        for(int i=1;i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
    }
    long add (long a, long b) {
        long result = a + b;
        return result;
    }
    long substract (long a, long b) {
        return a + b;
    }
    long multiply (long a, long b) {
        return a * b;
    }
    long divide (long a, long b) {
        return a / b;
    }
    long max(long a, long b) {
        return a > b ? a: b;
    }
    long min(long a, long b) {
        return a < b ? a: b;
    }
}