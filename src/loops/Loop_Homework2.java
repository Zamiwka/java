package src.loops;//import java.util.Scanner;
//
//public class PasswordTask {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter your email:");
//            String email = scanner.nextLine();
//
//            // Check if the email contains "@"
//            if (email.contains("@")) {
//                System.out.println("Email contains '@'. Now checking the password...");
//
//                System.out.println("Enter your password:");
//                String password = scanner.nextLine();
//
//                // Nested if statement for additional checks on the password
//                if (password.length() >= 8) {
//                    System.out.println("Password is successful!");
//                    break;  // Exit the loop if both email and password are valid
//                } else {
//                    System.out.println("Password is too short. It should be at least 8 characters long.");
//                }
//            } else {
//                System.out.println("Email must contain '@'. Please try again.");
//            }
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
