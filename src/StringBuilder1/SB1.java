package src.StringBuilder1;

import java.util.Arrays;

public class SB1 {
    public static void main(String[] args) {
        String name = "Zamira";
        String surname = "Sagynalieva";
        String fullname = name.concat(surname);
        System.out.println(fullname.substring(0,5));

        StringBuilder sb1 = new StringBuilder("Bischkek");
        sb1.insert(0,312);
        System.out.println(sb1);
        sb1.insert(0, "KG");
        System.out.println(sb1);
        sb1.insert(0,"DE");
        System.out.println(sb1);
//        .replace ()
        StringBuilder sb2 = new StringBuilder("Kyrgyzstan");
        sb2.replace(0,3,"Bisch");
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("Germany");
        sb3.replace(2,3,"DE");
        System.out.println(sb3);
//        .reverse
        StringBuilder sb4 = new StringBuilder("kitep");
        sb4.reverse();
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("nan");
        sb5.reverse();
        System.out.println(sb5);

//        .delete
         StringBuilder sb6 = new StringBuilder("Iphon");
         sb6.delete(0,2);
        System.out.println(sb6);

//        .deleteCharAt

        sb6.deleteCharAt(1);
        System.out.println(sb6);

//        .toString

        StringBuilder sb7 = new StringBuilder("Beku Beku");
        System.out.println(sb7.toString());

        int [] arr = {25,45,2,34};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

//        .append()

        StringBuilder sb8 = new StringBuilder("Zarina");
        StringBuilder sb9 = new StringBuilder("Alymbaeva");











    }
}

