import java.util.*;

import static java.util.Collections.*;

public class Ex11_13_Collections {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list,2);
        System.out.println(list);

        swap(list, 0, 2);
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list,3);
        System.out.println("Index of 3 = "+idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));
        System.out.println("min="+max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list = "+list);

        List newList = nCopies(list.size(),2);
        System.out.println("newList = "+newList);
        System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true

        copy(list, newList);
        System.out.println(newList);
        System.out.println(list);

        replaceAll(list, 2, 1);
        System.out.println(list);
    }
}
