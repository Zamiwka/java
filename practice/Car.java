package practice;

public class Car {
    public  String marca;
    protected String model;
    String color;
    private int yer;
    Passenger passenger;

    public Car(String marca, String model, String color, int yer, Passenger passenger) {
        this.marca = marca;
        this.model = model;
        this.color = color;
        this.yer = yer;
        this.passenger = passenger;
    }

    public int getYer() {
        return yer;
    }
    public String drive(boolean gas){
        if(gas){
            return "Woom- woom";
        }
        return "stop";
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yer=" + yer +
                ", passenger=" + passenger +
                '}';
    }
}
