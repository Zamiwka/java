package oop.encapsulation;

public class Smartphone {
    public String model;
    public String strana;
    public String os;
    public int memory;
    private int inn;


    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", strana='" + strana + '\'' +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", inn=" + inn +
                '}';
    }

    public Smartphone(String model, String strana, String os, int memory, int inn) {
        this.model = model;
        this.strana = strana;
        this.os = os;
        this.memory = memory;
        this.inn = inn;
    }
    public int getInn(){
        return inn;
}




}


