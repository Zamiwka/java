package oop.inheritance.human;

public class Ruki {

    private String color;
    public String kakie;


    public Ruki(String color, String kakie) {
        this.color = color;
        this.kakie = kakie;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ruki{" +
                "color='" + color + '\'' +
                ", kakie='" + kakie + '\'' +
                '}';
    }
}
