package oop.encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car Lexus = new Car("Lexus","GX470","autopilot");
        System.out.println(Lexus.marka);
        System.out.println(Lexus.model);
        System.out.println(Lexus.getProgram());
        Lexus.setProgram("autopilot2");
        System.out.println(Lexus.getProgram());


    }
}
