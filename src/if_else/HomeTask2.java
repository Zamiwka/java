package src.if_else;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

       Scanner scan  = new Scanner(System.in);

        System.out.println("nazvanie sadika: true || false");
        boolean sadik = scan.nextBoolean();


        if (sadik == true){
            System.out.println("Dobro pojalovat` v sadik 'kolobok' ");
            System.out.println("ukajite vozrast");
            int age  = scan.nextInt();
            if (age >= 0  && age <= 2 ) {
                System.out.println("Yasli gruppa");
            }else if (age >= 2 && age <=4) {
                System.out.println("Mladshaya Gruppa");
            } else if(age >= 4 && age <= 6) {
                System.out.println("Starshaya Gruppa");}
              else {
                System.out.println("Minday San jok.");
            }

            }
        if (sadik == false){
            System.out.println("Minday sadik jok");
        }
        }
    }