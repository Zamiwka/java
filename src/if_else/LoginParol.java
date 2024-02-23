package src.if_else;

import java.util.Scanner;

public class LoginParol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("username:");
        String username = scanner.nextLine();

        if (username.equals("zamira")) {
            System.out.print("password:");
            String password = scanner.nextLine();

            if (password.equals("1234")) {
                System.out.println("vy uspewno vowli");
            } else {
                System.out.println("ne pravilnyi parol");
            }
        } else {
            System.out.println("ne pravilnyi username");
        }
    }
}
