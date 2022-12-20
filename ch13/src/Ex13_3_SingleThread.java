public class Ex13_3_SingleThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<30; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1:"+(System.currentTimeMillis()));
        for(int i=0; i<30; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2:"+(System.currentTimeMillis()));
    }
}
