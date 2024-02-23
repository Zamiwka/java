package src.home_work;
import java.util.Scanner;

public class Fly_Jump2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double standartnaya_tsena = 1000.0;

        double Skidka = 0.5;    //10%

        int Dron = 2;

        double фотоцена = 50.0;

        System.out.println("вы будете приходить еще раз да/нет");
        String постояныйклиент = scanner.nextLine();

        System.out.println("фото отдельная цена хотели бы купить да /нет");
        String сфоткой = scanner.nextLine();

        System.out.println("хотели бы воспользоваться услугами дрона да/нет");
        String сДроном = scanner.nextLine();

        double общаяцена = standartnaya_tsena;
        if (постояныйклиент.equalsIgnoreCase("да")){
            общаяцена -= общаяцена * Skidka;

        }
        if (сфоткой.equalsIgnoreCase("да")){
            общаяцена *= Dron;

        }else {
            System.out.println("итого");
        }
        System.out.println("общая сумма : " + общаяцена);

        scanner.close();



    }

}