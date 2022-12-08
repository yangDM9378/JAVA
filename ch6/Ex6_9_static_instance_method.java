class Ex6_9_static_instance_method {
    long a, b;

    long add() {
        return a + b; // iv사용
    }

    static long add(long a, long b) {
        return a + b; // iv사용 x
    }
}

class test {
    public static void main(String[] args) {
        System.out.println(Ex6_9_static_instance_method.add(200L, 100L)); // 클래스 메서드 호출
        Ex6_9_static_instance_method mm = new Ex6_9_static_instance_method(); // 인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add()); //인스턴스 호출
    }
}