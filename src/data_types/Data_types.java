package src.data_types;

public class Data_types {
    public static void main(String[] args) {

        System.out.println("Privet!");

        /*               Data types  |  Типы данных
                      /                             \
                  Primitive                      // Non-primitive
              /       |       \
         Logical  Numeric  Character                 Linked (Ссылочный)
           ||        ||           \\
         Boolean  Дробные(1.2)   Character
                  Целочисленные(1)
         true     float           char                String
         false    double                              Arrays [10000, 10001] - Massivy []
                  short                               User defined
                  int
                  long
         */



        // primitive
        byte a = 12; // -128 127
        System.out.println(a);

        short b = 1000; // -32768  32767
        System.out.println(b);

        int c = 10000;
        int c1 = 10001;
        System.out.println(c);
        System.out.println(c1);


        long d = 1000000776868L;
        System.out.println(d);

        long d1 = 110;
        byte d2 = (byte) d1; // casting   convert
        System.out.println(d2);

        float e = 121245f; //32 byte
        System.out.println(e);

        double f = 2222656.56d; // 64 byte
        System.out.println(f);

        System.out.println("___");
        double f1 = 6.6;
        int f2 = (int) f1; // 6.6  6
        System.out.println(f2);

        System.out.println("____");

        char l = 'c';
        char m = 'C';
        char n = 78;
        String n1 = "s";

        System.out.println(l);
        System.out.println(m);
        System.out.println(n);

        boolean t = true;
        boolean p = false;
        System.out.println(t);
        System.out.println(p);

        // non-primitive (ссылочный)

        String slovo = "Privet";
        System.out.println(slovo);

        // массивы
        // interface
        // user defined


    }

}