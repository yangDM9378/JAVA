import javax.swing.*;

public class Ex13_5_IOBlocking_MultiThread {
    public static void main(String[] args) throws Exception {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무값 입력");
        System.out.println("입력값 "+input+"입니다");
    }
}

class ThreadEx5_1 extends Thread {
    public void run() {
        for(int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000); //1초지연
            } catch(Exception e) {}
        }
    }
}
