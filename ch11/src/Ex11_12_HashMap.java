import java.util.HashMap;
import java.util.Scanner;

public class Ex11_12_HashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId","1234");
        map.put("adsfa","1234");
        System.out.println(map);
        map.put("adsfa","1111");
        System.out.println(map);

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("id와 password를 입력");
            System.out.print("id:");
            String id = s.nextLine().trim();

            System.out.print("password:");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재 x. 다시 입력");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비번일치 x. 다시입력");
            } else {
                System.out.println("일치");
                break;
            }
        }
    }
}
