import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14_5_CollectionFramework_FunctionInterface {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i);

        // list 모든 요소 출력
//        Iterator it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        list.forEach(i -> System.out.print(i+","));
        System.out.println(list);

        // list에서 2또는 3의 배수 제거
        list.removeIf(x -> x%2==0 || x%3==0);
        System.out.println(list);

        list.replaceAll(i -> i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        // map의 모든 요소를 {k,v}형식 출력
//        Iterator it = map.entrySet().iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        map.forEach((k,v) -> System.out.print("{"+k+","+v+"}"));
        System.out.println();
    }
}
