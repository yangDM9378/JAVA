import java.util.Scanner;

public class Ex4_15_do_while {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random()*100)+1;
        System.out.println("answer="+answer);
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자입력");
        input = scanner.nextInt();
        do {
            System.out.print("1과 100사이 수를 입력");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도");
            } else if (input < answer) {
                System.out.println("더큰수로 시도");
            }
        }
        while(input!=answer);
    }
}
