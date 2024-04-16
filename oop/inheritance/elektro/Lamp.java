package oop.inheritance.elektro;

public class Lamp {
    private String type;

    public Lamp(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "type='" + type + '\'' +
                '}';
    }
}
