import java.util.*;

public class Ex11_8_HashSet {
    public static void main(String[] args) {
        Object[] objArr =  {"1", new Integer(1),"2","3","3","4","5"};
        Set set = new HashSet();

        for(int i=0; i<objArr.length; i++){
            set.add(objArr[i]); // HashSet에 objectArr의 요소 저장
        }
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
