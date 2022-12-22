import java.io.*;
import java.util.stream.*;

public class Ex14_12_StreamMap {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"),
                            new File("Ex1.bak"),
                            new File("Ex2.java"),
                            new File("E3")};
        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println); // 모든 파일의 이름 출력

        fileStream = Stream.of(fileArr); // 스트림을 다시 생성

        fileStream.map(File::getName)  //Stream<File> -> Stream<String>
                .filter(s -> s.indexOf('.')!=-1) // 확장자가 없는 것은 제외
                .peek(s->System.out.printf("filename=%s%n",s))
                .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 출력
                .peek(s->System.out.printf("filename=%s%n",s))
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct() // 중복제거
                .forEach(System.out::println);
    }
}
