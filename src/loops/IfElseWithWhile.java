package loops;

import java.util.Scanner;

class IfElseWithWhile {
    public static void main(String[] args) {
        // Basic if statement
        if (1 > 0) {
            System.out.println(true);
        }

        // If-else statement
        if (20 > 50) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scanner.nextLine();

        boolean containsAtSymbol = false;
        int i = 0;


        while (i < email.length()) {
            if (email.contains("@") ) {
                containsAtSymbol = true;
                System.out.println("Enter your password");
                String password = scanner.nextLine();

                boolean containsExclamation = false;
                int j = 0;


                while (j < password.length()) {
                    if (password.contains("@")) {
                        System.out.println("You are registered!");
                        containsExclamation = true;
                        break;
                    }
                    j++;
                }

                if (!containsExclamation) {
                    System.out.println("Incorrect password");
                }

                break;
            }
            i++;
        }

        if (!containsAtSymbol) {
            System.out.println("Incorrect login");
        }
    }
}
