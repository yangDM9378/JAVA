import java.util.ArrayList;

public class Ex12_1_GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10); // list.add(new Integer(10));
        list.add(20);
        list.add(30);

        Integer i = (Integer) list.get(2);

        System.out.println(list);
    }
}
