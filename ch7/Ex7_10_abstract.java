abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {}
    void stop() {}
}
public class Ex7_10_abstract {
    public static void main(String[] args) {
//        Player p = new Player(); // 추상클래스의 객체 생성
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100);
        ap.stop();


    }
}
