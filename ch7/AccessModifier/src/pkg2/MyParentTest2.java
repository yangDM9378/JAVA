package pkg2;

class MyChild extends pkg1.MyParent {
    public void printMembers() {
//        System.out.println(prv); // 에러
//        System.out.println(dft); // 에러
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        pkg1.MyParent p = new pkg1.MyParent();
//        System.out.println(p.prv); // 에러
//        System.out.println(p.dft); // 에러
//        System.out.println(p.prt); // 에러
        System.out.println(p.pub);
    }
}
