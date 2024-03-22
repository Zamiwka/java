package oop;

public class Zamacake {
    public static void main(String[] args) {
        CaKe medovik = new CaKe();
        medovik.autor = "Zamacake";
        medovik.color = "braun";
        medovik.ingredients = "sahar,med,muka,jumurtka,soda,sguwenka,tuz";
        medovik.name = "medovik";
        medovik.size = 1.5f;
        medovik.weight = 35;
        System.out.println(medovik.price(medovik.size));
        System.out.println(medovik);
    }
}
