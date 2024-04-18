package oop.inheritance.human;

public class HumanMain {
    public static void main(String[] args) {

        Human myhuman = new Human();

        System.out.println("Human's arm: " + myhuman.getDlinnye().getColor());
        System.out.println("Human's arm: " + myhuman.getKorotkie().getColor());
    }
}
