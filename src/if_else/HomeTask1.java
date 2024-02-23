package src.if_else;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {


        // if - esli
        // else - inache
        Scanner scan = new Scanner(System.in);
/*        int age = scan.nextInt();
        if (age >= 16) {
            System.out.println("Passport");

        } else {
            System.out.println("Passport alganga bolboyt");
 }*/
        System.out.println("Atyn kim");
        String name = scan.nextLine();
        String name_vip = "Aidai";

        if (name.equals("name_vip")) { // equals --> barabar, pohoji
            System.out.println("Kirsen bolot");
        } else{
            System.out.println("Kirgenge uruksat jok");
        }

    }
}