package oop.inheritance.strana;

public class StranaMain {
    public static void main(String[] args) {
        Gorod mygorod = new Gorod();
        System.out.println("Rayon Sverdlovsky:" + mygorod.getBokonbaeva().getName());
        System.out.println("Rayon Leninsky :" + mygorod.getManas().getName());
    }
}
