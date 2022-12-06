public class Ex4_7_random {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println(Math.random());
            System.out.println(Math.random()*10);
            System.out.println((int)(Math.random()*10));
            // -5~5사이 난수 20개 출력
            System.out.println((int)(Math.random()*11)-5);
        }
    }
}
