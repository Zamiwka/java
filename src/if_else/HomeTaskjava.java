package src.if_else;

import java.util.Scanner;

public class HomeTaskjava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vedite rol");
        String role = scanner.nextLine();
        System.out.println("vedite parol:");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("12345")) {
            System.out.println("vse polzovateli");

        } else {

            System.out.println(" Privet,kak vas zovut?");
            String name = scanner.nextLine();




        }

    }
}
