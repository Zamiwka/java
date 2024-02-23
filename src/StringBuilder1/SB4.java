package src.StringBuilder1;

public class SB4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Madina");

        StringBuilder sb2 = new StringBuilder("Malikova");
        sb1.append(sb2);
        System.out.println(sb1);
        System.out.println(sb2);


    }


}
