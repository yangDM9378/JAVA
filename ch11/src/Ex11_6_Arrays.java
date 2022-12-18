import java.util.Arrays;

public class Ex11_6_Arrays {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12},{21,22}};
        System.out.println(Arrays.toString(arr)); // [0,1,2,3,4]
        System.out.println(Arrays.deepToString(arr2D)); // [[11,22],[21,22]]

        int[] arr2 = Arrays.copyOf(arr, 3); // [0,1,2]
        int[] arr3 = Arrays.copyOf(arr, 6); // [0,1,2,3,4,0]
        int[] arr4 = Arrays.copyOfRange(arr,2,4); // [2,3]
        System.out.println("arr2"+Arrays.toString(arr2));
        System.out.println("arr3"+Arrays.toString(arr3));
        System.out.println("arr4"+Arrays.toString(arr4));

        int[] arr7 = new int[5];
        Arrays.fill(arr7,9); // [9,9,9,9,9]
        System.out.println("arr7"+arr7); // [0,1,2,3,4]
//        Arrays.setAll(arr7, i → (int)(Math.random()*5)+1); // [1,5,2,1,1]

        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

//        String[][] str2D = new String[][]{{”aaa”,”bbb”}, {”AAA”,”BBB”}};
//        String[][] str2D2 = new String[][]{{”aaa”,”bbb”}, {”AAA”,”BBB”}};
//        System.out.println(Arrays.equals(str2D, str2D2)); // false
//        System.out.println(Arrays.deepequals(str2D, str2D2)); // true

        char[] chArr = {'A','D','C','B','E'};
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr,'B'));
        Arrays.sort(chArr);
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr,'B'));
    }
}
