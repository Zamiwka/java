package src.loops;

import java.util.Scanner;

public class Loop_Homework {
    public static void main(String[] args) {



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

                // Check if email contains '@' using while loop
                while (i < email.length()) {
                    if (email.charAt(i) == '@') {
                        containsAtSymbol = true;
                        System.out.println("Enter your password");
                        String password = scanner.nextLine();

                        boolean containsExclamation = false;
                        int j = 0;

                        // Check if password contains '!' using while loop
                        while (j < password.length()) {
                            if (password.charAt(j) == '!') {
                                System.out.println("You are registered!");
                                containsExclamation = true;
                                break;
                            }
                            j++;
                        }

                        if (!containsExclamation) {
                            System.out.println("Incorrect password");
                        }

                        break; // Exit the email loop after processing email and password
                    }
                    i++;
                }

                if (!containsAtSymbol) {
                    System.out.println("Incorrect login");
                }
            }
        }



