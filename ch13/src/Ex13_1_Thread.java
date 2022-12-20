public class Ex13_1_Thread {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread { // Thread상속받아 주현
    public void run(){// 쓰레드 수행 작업 작성
        for(int i=0; i<5; i++){
            System.out.println(this.getName());
        }
    }
}

class ThreadEx1_2 implements Runnable { // Runnable 인터페이스 구현 쓰레드 구현
    public void run(){ // 쓰레드 수행 작업 작성
        // Thread.currentThread() // 실행중인 Thread 반환
        System.out.println(Thread.currentThread().getName());
    }
}
