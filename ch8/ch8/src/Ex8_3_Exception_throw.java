public class Ex8_3_Exception_throw {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의발생");
            throw e;
        } catch (Exception e) {
            System.out.println("에러메시지"+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
