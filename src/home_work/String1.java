package home_work;
import java.util.*;



//String

public class String1 {
    public static void main(String[] args) {
        String name = "Xiaomi";
        System.out.println(name.length());

        String name2 = "Xiaomi";
        System.out.println(name2.charAt(0));

        String name4 = "Xiaomi";
        System.out.println(name4.charAt(1));

        String name3 = "Xiaomi";
        System.out.println(name3.substring(2)); // Output: "ello"
        System.out.println("_____________________");

//StringBuilder

        StringBuilder sb1 = new StringBuilder(" Hello ");
        sb1.insert(0,312);
        System.out.println(sb1);
        sb1.insert(9, " World");
        System.out.println(sb1);
        sb1.insert(0," DE");
        System.out.println(sb1);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println(sb.toString()); // Output: "Hello"

        System.out.println("_____________________");

//Arrays
        int[] array = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(array, 5);
        System.out.println("Index of 5: " + index); // Output: "Index of 5: 2"

        int[] array2 = {3, 1, 5, 2, 4};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // Output: "[1, 2, 3, 4, 5]"

        String [] names = new String[5];
        names [0] = "Aida";
        System.out.println(Arrays.toString(names));
    }
}
