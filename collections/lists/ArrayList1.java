package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {
        int[] number = new int[4];
        number [0] = 1;
        number [1] = 3;
        number [3] = 44;
        System.out.println(Arrays.toString(number));
      //non generic
        ArrayList list1 = new ArrayList();
        list1.add(34);
        list1.add(true);
        list1.add("Hi");
        System.out.println(list1);

        // generic
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(222);
        list2.add(33);
        list2.add(1);
        System.out.println(list2);
        list2.add(0,55);
        System.out.println(list2);

        // .get()
        System.out.println(list2.get(2));


         // .size() lenght
        System.out.println(list2.size());

        // .clear()
//        list2.clear();
//        System.out.println(list2); // []

        //.remove()
        list2.remove(3);
        System.out.println(list2);

        // contains()
        System.out.println(list2.contains(221)); //false
        System.out.println(list2.contains(222)); // true

        //.set()
        list2.set(1,66);
        System.out.println(list2);

        //.isEmty
        System.out.println(list2.isEmpty()); // false

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(22);
        list3.add(24);
        System.out.println(list3);
        list3.addAll(list2);
        System.out.println(list3);

        list3.addAll(0,list2);
        System.out.println(list3);

        // removeAll()
        list3.removeAll(list2);
        System.out.println(list3);







    }
}
