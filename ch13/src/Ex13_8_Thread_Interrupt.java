import javax.swing.*;

public class Ex13_8_Thread_Interrupt {
    public static void main(String[] args) throws Exception {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        th1.start();

        System.out.println("isInterrupted():"+th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무값 입력");
        System.out.println("입력 값"+input+"입니다");
        th1.interrupt();
        System.out.println("isInterrupted():"+th1.isInterrupted());
        //main 쓰레드 확인
        System.out.println("interrupted():"+Thread.interrupted()); //th1.interrupted()->불가 interrupted()는 static

    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        int i =10;
        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0;x<250000000L;x++);
        }
        System.out.println("카운트 종료");
    }
}
