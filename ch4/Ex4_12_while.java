public class Ex4_12_while {
    public static void main(String[] args) {
        int i = 5;
        while(i-- != 0) {
            System.out.println(i);
        }

        System.out.println("--------------");
        // 각자리수의 합
        int num = 12345, sum = 0;
        System.out.println(12345%10);

        while(num>0) {
            sum += num % 10;
            System.out.println(num%10);
            num = num / 10;
        }
        System.out.println("각자리수의 합 "+sum);

    }
}
