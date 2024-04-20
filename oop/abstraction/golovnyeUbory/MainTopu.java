package oop.abstraction.golovnyeUbory;

public class MainTopu {
    public static void main(String[] args) {
        Kalpak akkalpak = new Kalpak("Bakai kalpak",56);
        System.out.println(akkalpak);
        akkalpak.type();
        Tebetei suusar = new Tebetei("Suusar Tebetei",48);
        System.out.println(suusar);
        suusar.prise();
        suusar.type();


    }
}
