package oop;

public class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Moinok";
        System.out.println(rex);
        System.out.println(rex.bark());
        System.out.println(rex.eat());
        System.out.println(rex.run());

        Dog aktosch = new Dog();
        aktosch.name = "AkTosch";
        aktosch.age =5;
        aktosch.breed = "Maschke";
        aktosch.color = "Belyi";

        System.out.println(aktosch);


    }

}
