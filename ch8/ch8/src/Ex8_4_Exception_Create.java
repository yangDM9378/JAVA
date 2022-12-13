public class Ex8_4_Exception_Create {
    public static void main(String[] args) {
        try {   // Exception과 그 자손은 예외처리 필수
            throw new Exception(); // Exception 고의 발생
        } catch (Exception e) {}

//        throw new RuntimeException();
    }
}
