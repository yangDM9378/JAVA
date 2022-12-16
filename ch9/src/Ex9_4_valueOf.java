import static java.lang.String.valueOf;

public class Ex9_4_valueOf {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int를 String으로 변환1

        double dVal = 200.0;
        String strVal2 = dVal + "";  // int를 String으로 변환2

        double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);// 문자열을 숫자로 바꾸는방법
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum); // join으로 연결
        System.out.println(strVal + "+" +strVal2+"="+sum2);
    }
}
