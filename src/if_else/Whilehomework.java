package src.if_else;
import java.util.Scanner;

public class Whilehomework {
    public static void main(String[] args) {
        //        if statment
        if (1 > 0){
            System.out.println(true);
        }
        //          if else statement
        if (20>50){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite email");
        String email = scanner.nextLine();

        boolean sobachkasoderjit = false;

        int i=0;
        while (i < email.length()) {
            if (email.charAt(i) == '@') {
                sobachkasoderjit = true;
                System.out.println("Vvedite password");
                String psw = scanner.nextLine();
                boolean registered = false;
                int j=0;
                while (j< psw.length())  {
                    if (psw.charAt(j) == '!') {
                        System.out.println("You registered!");
                        registered = true;
                        break;
                    }
                    j++;
                }
                if (!registered) {
                    System.out.println("Password incorrect");
                }
                break;
            }
            i++;
        }

        if (!sobachkasoderjit) {
            System.out.println("Login incorrect");
        }
    }

}