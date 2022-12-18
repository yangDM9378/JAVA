import java.util.HashSet;
import java.util.Iterator;

public class Ex11_10_HashSet2 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
        System.out.println("A="+setA);

        setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8"); setB.add("9");
        System.out.println("B="+setB);

        // 교집합
        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }
        // setA.retainAll(setB)

        // 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }
        // setA.removeAll(setB)

        // 합집합
        it = setA.iterator();
        while(it.hasNext()) {
            setHab.add(it.next());
        }
        it = setB.iterator();
        while(it.hasNext()) {
            setHab.add(it.next());
        }
        // setA.addAll(setB);

    }
}
