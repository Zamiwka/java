package practice;

public class CarMain {
    public static void main(String[] args) {

        Passenger nuraika = new Passenger("Nuraika",35);

        Car bmw = new Car("BMW","X7","green",2024,nuraika);
        System.out.println(bmw);
        System.out.println(nuraika);

    }

}
