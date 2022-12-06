import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'C', opt = '0';
        System.out.print("점수입력");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다 %n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }
        System.out.printf("학점은 %c%c", grade, opt);
    }
}
