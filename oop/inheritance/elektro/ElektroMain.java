package oop.inheritance.elektro;

public class ElektroMain {
    public static void main(String[] args) {
        Lamp samsung = new Lamp("Steklyaniy");

       Elektrichestvo severelektro = new Elektrichestvo("Seveelctro", samsung);
        System.out.println(severelektro);
        System.out.println(samsung);
        System.out.println(severelektro.getLamp().getType());
    }
}
