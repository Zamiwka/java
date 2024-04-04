package oop.polimorphism;

public class Multivarka {
    public static void main(String[] args) {

        Multivarka bosch = new Multivarka("Bosch","Germany",100);
        Multivarka gorenje = new Multivarka("Goreje");
        Multivarka samsung = new Multivarka("Samasung","Russian",5000);
        System.out.println(bosch);
        System.out.println(gorenje);
        System.out.println(samsung);


    }
    private String marka;
    public int price = 1990;
    public String strana;

    public Multivarka(String marka) {
        this.marka = marka;
    }

    public Multivarka(int price) {
        if (price >=2000){
            this.price=price;

        }

    }

    public Multivarka(String marka, String strana, int price){
        this.marka = marka;
        this.strana = strana;
        if (price >=2000){
            this.price=price;

        }
    }

    @Override
    public String toString() {
        return "Multivarka{" +
                "marka='" + marka + '\'' +
                ", price=" + price +
                ", strana='" + strana + '\'' +
                '}';
    }
}
