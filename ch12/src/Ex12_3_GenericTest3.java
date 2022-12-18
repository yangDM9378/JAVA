import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_3_GenericTest3 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv>   tvList = new ArrayList<Tv>();
//        ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러
//        List<Tv> tvList = new ArrayList<Tv>(); // OK

        productList.add(new Tv());
        productList.add(new Audio());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());
//        tvList.add(new Audio()); // 에러

        printAll(productList);
        // printAll(tvList); //컾파일에러
    }
    public static void printAll(ArrayList<Product> list) {
        for(Product p : list)
            System.out.println(p)
;    }
}
