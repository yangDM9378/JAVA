

class Data_1 {
    int value;
//    Data_1() {} // 기본생성자 추가 생성자가 하나일 경우 생략가능
}

class Data_2 {
    int value;

    Data_2() {} // 기본생성자
    Data_2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

class Ex6_11_constructor {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // 기본생성자 없어 Compile error
    }
}