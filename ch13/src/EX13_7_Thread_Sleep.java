public class EX13_7_Thread_Sleep {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        ThreadEx7_2 th2 = new ThreadEx7_2();
        th1.start();
        th2.start();

        delay(2*1000);
        System.out.print("<<main종료>>");

    }
    // 예외 처리를 꼭 해야하므로 별로 메서드로 만들어 사용
    static void delay(long millis) {
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for(int i=0; i<100; i++) System.out.print("-");
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx7_2 extends Thread {
    public void run() {
        for(int i=0; i<100; i++) System.out.print("|");
        System.out.print("<<th2 종료>>");
    }
}
