package src.home_work;
import java.util.Scanner;

public class Fly_Jump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("вы у нас подписаны?: true || false");
        boolean flyjump = scan.nextBoolean();

        if (flyjump) {
            System.out.println("Dobro pojalovat` v flyjump' ");
            System.out.println("ukajite vozrast");
            int age = scan.nextInt();

            if ((age >= 0 && age <= 16) || (age >= 60 && age <= 100)) {
                System.out.println("vy ne mojete prigat");
            } else if (age > 16 && age <= 60) {
                System.out.println("vy mojete prigat");
            } else if (age > 100 && age <= 1000) {
                System.out.println("ne vernyi vozrast");
            }
        }
    }
}
