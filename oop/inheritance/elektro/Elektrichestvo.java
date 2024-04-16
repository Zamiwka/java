package oop.inheritance.elektro;

public class Elektrichestvo {
    public String firma;

    private Lamp lamp;

    public Elektrichestvo(String firma, Lamp lamp) {
        this.firma = firma;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Elektrichestvo{" +
                "firma='" + firma + '\'' +
                ", lamp=" + lamp +
                '}';
    }
}
