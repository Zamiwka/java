package src.switch1;

import java.util.Scanner;

public class SwitchTask1 {

    public static void main(String[] args) {



        // Uslovnie construktsii switch-case
        Scanner scan = new Scanner(System.in);
        String season = scan.next();

        switch (season){

            default:
                System.out.println("Ne pravilno");
                break;
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("Ougust");
                break;
            case "9":
                System.out.println("Septembert");
                break;
            case "10":
                System.out.println("October");
                break;
            case "11":
                System.out.println("November");
                break;
            case "12":
                System.out.println("December");
                break;
        }
    }

}