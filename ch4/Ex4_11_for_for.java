public class Ex4_11_for_for {
    public static void main(String[] args) {
//구구단
        for(int i=2; i<=9;i++) {
            for(int j=1; j<=9; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
//별찍기
        for (int k=1; k<=5;k++) {
            for (int z=1; z<=k; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
