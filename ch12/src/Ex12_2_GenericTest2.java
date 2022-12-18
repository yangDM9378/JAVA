import java.util.*;

class Tv1 {}
//class Audio {}

public class Ex12_2_GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Tv1> list=new ArrayList<Tv1>();
        list.add(new Tv1());
        // list.add(new Audio();

        Tv1 t = (Tv1)list.get(0);
//        Tv1 t = list.get(0);
    }
}
