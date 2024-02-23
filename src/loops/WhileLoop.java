package src.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 1;


        while (n < 5) {
            System.out.println(n);
            n++;
        }
        for (int m = 1; m < 5; m++) {
            System.out.println(m);
        }
        int days = 0;
        int savings = 0;
        int som = 1000;

        while (savings < 100000) {
            savings = savings + som;
            days++;

        }
        System.out.println("nam potrebuetsya" + days + "dnei");

        int days1 = 0;
        int saivings1 = 0;
        int som1 = 1000;
        for (days1 = 0; saivings1 < 100000; days1 += 2) {
            saivings1 += som1;

        }
        System.out.println("nam potrebuetsya " + days1 + "dnei");

        //         do - while loop
        int q = 7;
        do {
            System.out.println(q);
            q++;
        }
            while (q < 5) ;



    }
}
