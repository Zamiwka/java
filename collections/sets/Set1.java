package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        // HaschSet        LinkedHaschSet           TreeSet

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(33);
        set1.add(4545454);
        set1.add(325);
        set1.add(31);
        set1.add(5);
        set1.add(53);
        System.out.println(set1); // [33, 325, 5, 53, 4545454, 31]


        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(100);
        set2.add(15);
        set2.add(21);
        System.out.println(set2); //[2, 4, 6, 8, 10, 15, 21]

        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(44);
        set3.add(30);
        set3.add(20);
        set3.add(10);
        set3.add(50);
        System.out.println(set3);

    }

}
