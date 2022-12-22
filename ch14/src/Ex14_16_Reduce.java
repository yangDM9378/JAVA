import java.util.*;
import java.util.stream.*;

public class Ex14_16_Reduce {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "JAVA", "Lambda", "Stream", "OptionalDouble", "IntStream"
        };

        Stream.of(strArr)
                .parallel()// 병렬처리
                .forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
        Optional<String> sWord = Stream.of(strArr).parallel()// 병렬처리
                .filter(s->s.charAt(0)=='s').findAny();

        System.out.println("noEmptyStr="+noEmptyStr);
//        System.out.println("sWord="+sWord.get());

        // Stream<String>을 Stream<Integer로 변환 (s) -> s.length()
        // Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);

        // Stream<String[]>을 IntStream 변환
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a,b) -> a+1);
        int sum = intStream2.reduce(0, (a,b) -> a+b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("count="+count);
        System.out.println("sum="+sum);
        System.out.println("max="+max.getAsInt());
        System.out.println("min="+min.getAsInt());
    }
}
