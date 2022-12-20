public class Ex13_10_Thread_join {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx10_1 th1 = new ThreadEx10_1();
        ThreadEx10_2 th2 = new ThreadEx10_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis(); // 시작시간

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        System.out.print("소요시간:"+ (System.currentTimeMillis()-startTime));
    }
}

class ThreadEx10_1 extends Thread{
    public void run() {
        for(int i=0; i<300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx10_2 extends Thread {
    public void run() {
        for(int i=0; i<300; i++) {
            System.out.print(new String("|"));
        }
    }
}