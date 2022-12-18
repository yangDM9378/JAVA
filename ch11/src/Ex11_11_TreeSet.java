import java.util.*;

public class Ex11_11_TreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 범위검색, 정렬. 정렬 필요x

        for (int i=0;set.size()<6;i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
