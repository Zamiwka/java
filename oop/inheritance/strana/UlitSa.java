package oop.inheritance.strana;

public class UlitSa {
    private  String name;
    public UlitSa(String name ){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UlitSa{" +
                "name='" + name + '\'' +
                '}';
    }
}
