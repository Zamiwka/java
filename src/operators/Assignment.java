package src.operators;
public class Assignment {

    public static void main(String[] args) {
        //   =  +=  -=  *=  /=  %=  &=  |=  ^=

        // =
        int num = 10;
        System.out.println(num);

        // +=
        num += 5; // 10 + 5 = 15
        // num = num + 5;
        System.out.println(num);

        // -=
        num -= 1; // 15 - 1 = 14
        System.out.println(num);

        // *=
        num *= 2; // 14 * 2 = 28
        System.out.println(num);

        // /=
        num /= 4; // 28 / 4 = 7
        System.out.println(num);

        // %=
        num %= 3; // 7 % 3 = 1
        System.out.println(num);

        double d1 = (double) num;
        d1 /= 2;
        System.out.println(d1);
    }
}


