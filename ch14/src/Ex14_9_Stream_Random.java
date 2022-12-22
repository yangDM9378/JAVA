import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_9_Stream_Random {
    public static void main(String[] args) {
//        IntStream intStream = new Random().ints();
//        intStream.limit(5).forEach(System.out::println);
        IntStream intStream = new Random().ints(5);
        intStream.forEach(System.out::println);

    }
}
