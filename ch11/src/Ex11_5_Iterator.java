import java.util.*;


public class Ex11_5_Iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();

//        ArrayList c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

//        // for문 사용시 ArrayList에서 다른 Collections을 다른것으로 바뀔때 에러 발생
//        for (int i=0; i<c.size(); i++) {
//            Object obj = c.get(i);
//            System.out.println(obj);
//        }
    }
}
