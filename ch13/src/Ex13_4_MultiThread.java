public class Ex13_4_MultiThread {
    static long startTime = 0;
    public static void main(String args[]) {
        ThreadEx4_1 th1 = new ThreadEx4_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1:" + (System.currentTimeMillis()));
    }
}

class ThreadEx4_1 extends Thread {
    public void run() {
        for(int i=0; i<100; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2:" + (System.currentTimeMillis()));
    }
}
