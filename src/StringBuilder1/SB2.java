package src.StringBuilder1;

import javax.xml.transform.sax.SAXResult;

public class SB2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); //16

        StringBuilder sb2 = new StringBuilder(5);
        System.out.println(sb2.capacity()); //5

        StringBuilder sb3 =new StringBuilder("hellohi");
        System.out.println(sb3.capacity()); // 16 + 7= 23

        StringBuilder sb4 = new StringBuilder("Knadai soonunbu men jakwi");
        System.out.println(sb4.capacity());   // 46

         // formula CAPACITY= (AKYRKY capacity +1) *2

        StringBuilder sb6 = new StringBuilder();
        System.out.println(sb6.capacity() + "soonun");
        sb6 .append("jaschoo keremet jana kulpunai");
        System.out.println(sb6.capacity() + "!!!");
        System.out.println("--------");

        String name = "Nuradis";
        int fio = 1;
        System.out.println(name + fio);
//        System.out.println(name.concat(fio));

        StringBuilder sb5 = new StringBuilder();
        sb5.append('k'); // char
        sb5.append(99); // int
        sb5.append(true); // boolean
        sb5.append("nan");//String
        System.out.println(sb5);






    }
}
