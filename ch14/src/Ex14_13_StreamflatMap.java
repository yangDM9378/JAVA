import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_13_StreamflatMap {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def","ghi"},
                new String[]{"ABC","GHI","JKLMN"});
//        Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase) // 소문자로 바꾸기
                .distinct() // 중복제거
                .sorted() // 정렬
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Beleive or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
