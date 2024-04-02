package oop.encapsulation;

public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iphon13","Germany","ios",500,1223);
        System.out.println(iphone.model);
        System.out.println(iphone.strana);
        System.out.println(iphone.os);
        System.out.println(iphone.getInn());
        System.out.println(iphone.memory);

    }

}
