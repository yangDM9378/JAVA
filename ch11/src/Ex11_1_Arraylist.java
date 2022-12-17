import java.util.*;

public class Ex11_1_Arraylist {
    public static void main(String[] args) {
        // 기본 길이(용량) 10인 Arraylist 생성
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5)); // 오토박싱을 통해 list1.add(5)입력가능
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(1));
        list1.add(new Integer(0));

        // ArrayList(Collection C)
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        // 오름차순 정렬 Collections 유틸 클래스를 통해 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
        System.out.println();

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        // 객체 변환
        list2.set(3, "AA");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();


        // 문자 추가
        list1.add(0,"1");
        System.out.println(list1);
        System.out.println("index="+list1.indexOf("1"));
        System.out.println();

        list1.remove(0); // 인덱스가 0인 객체 삭제
        list1.remove(new Integer(1)); // 1을 삭제
        System.out.println("remove"+list1);
        System.out.println();

        // list1에서 list2와 겹치는 부분 삭제
        System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        // list2에 list1에 포함된 객체를 삭제
        for(int i=list2.size()-1; i>=0;i--) {
            if(list1.contains(list2.get(0)))
                list2.remove(i);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

    }
}
