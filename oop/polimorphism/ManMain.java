package oop.polimorphism;

public class ManMain {
    public static void main(String[] args) {
        Man adam = new Man();
        Man adam2 = new Man("Man");
        Man adam3 = new Man(45);
        Man adam4 = new Man("Man",56);
        Man adam5 = new Man(77,"Man");
        System.out.println(adam);
        System.out.println(adam2);
        System.out.println(adam3);
        System.out.println(adam4);
        System.out.println(adam5);
        System.out.println(adam.toWork("men iwyep jatam"));
        System.out.println(adam.toWork(8,"iwtedim"));

    }
}
