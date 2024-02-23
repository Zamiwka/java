package src.if_else;

import java.util.Scanner;

public class Uslovie2 {
    public static void main(String[] args) {

        // if - else statement - ladder

/*        if () {

        } else if () {
    } else }
*/
/*        Scanner scan = new Scanner(System.in);
        System.out.println("Ukajite svoy vozrast:");
        int age = scan.nextInt();
        if (age >= 0 && age < 16) {
            System.out.println("International passport alsa bolot");
        } else if (age >= 16 && age <= 120) {
            System.out.println(" ID passport | International passort");
        } else {
            System.out.println("No passport");
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("V kakoy otdel? Ukajite vozrast:");
        System.out.println("1 - Etaj  \n 2 - tenagers \n 3 - vzroslie \n 4 - dlya doma");
        int age = scan.nextInt();

        if (age >= 0 && age < 12) {
            System.out.println("Idite v otdel dlya detey na 0 etaj");
        } else if (age >= 12 && age< 18) {
            {

            }
        }
    }
}