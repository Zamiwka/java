package oop;

public class CaKe {
    public String name;
    public String ingredients;
    public String color;
    public int weight;
    public float size;

    public String autor;
    public float price(float size) {
        return 1000 * size;
    }

    @Override
    public String toString() {
        return "CaKe{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", autor='" + autor + '\'' +
                '}';
    }
}

