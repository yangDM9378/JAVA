import java.util.*;

public class Ex11_4_Queue_record {
    static Queue q= new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("help를 입력시 도움말 표시");
        while (true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말");
                    System.out.println(" q 또는 Q - 프로그램 종료");
                    System.out.println(" history - 최근 명령어" + MAX_SIZE + "개 보이기");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);

                    LinkedList list = (LinkedList)q;

                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i + 1) + "." + list.get(i));
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류");
            }
        }
    }
    public static void save(String input) {
        if(!"".equals(input))
            q.offer(input);

        // queue의 초대 크기를 넘으면 제일 처음 입력 삭제
        if(q.size() > MAX_SIZE)
            q.remove();
    }
}
