package src.StringBuilder1;

public class SB3 {

    public static void main(String[] args) {
        // Pool
        // mutable vs  IMMUTABLE
        // String - не изменяемый (imutable)
        // StringBuilder- изменяемый (muttable)

        String str1="Naryn";
        String str2="Naryn";
        boolean res1 = str1==str2;
        boolean res2 = str1.equals(str2);
        System.out.println(res1);
        System.out.println(res2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("-------");

        //Heap

        StringBuilder sb1 = new StringBuilder("Bischkek");
        StringBuilder sb2 = new StringBuilder("Bischkek");
        StringBuilder sb3 = new StringBuilder("Naryn");
        boolean res3 = sb1 == sb2;
        boolean res4 =   sb1.equals(sb2);

        System.out.println(res3);
        System.out.println(res4);

        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());

        boolean res5 = sb3.toString().equals(str1);
        System.out.println(res5);

        sb1.append("KG");
        System.out.println(sb1);



    }
}
