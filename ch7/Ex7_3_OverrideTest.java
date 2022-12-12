class MyPoint3 {
    int x;
    int y;

    String getLocation() {
        return "x:" +x+ ",y:"+y;
    }

    MyPoint3(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x:" +x+ ",y:"+y;
    }
}

//class MyPoint3D extends MyPoint3 {
//    int z;
//    String getLocation() {
//        return "x:" +x+ ",y:"+y+",z:"+z;
//    }
//}

class Ex7_3_OverrideTest {
    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3(1,2);
        System.out.println(p);
//        MyPoint3 p = new MyPoint3();
//        p.x = 3;
//        p.y = 5;
    }
}
