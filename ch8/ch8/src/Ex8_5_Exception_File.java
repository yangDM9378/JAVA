import java.io.*;

public class Ex8_5_Exception_File {
    public static void main(String[] args) {
        try {
            File f = createFile(""); // 예외발생
            System.out.println( f.getName()+"파일이 성공적으로 생성");
        } catch (Exception e) {
            System.out.println(e.getMessage()+"다시 입력");
        }
    }   // main 메서드 끝

    static File createFile(String fileName) throws Exception {
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이름이 유효 x");
        File f= new File(fileName);
        f.createNewFile();
        return f;
    }
}
