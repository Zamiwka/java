package oop.abstraction.golovnyeUbory;

public  abstract class BawKyim {
    public  String name;
    private int size;

    public BawKyim(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public abstract  void  type();
    public  void prise(){
        System.out.println("4500");
    }
    public  void natsia(){
        System.out.println("kyrgyz");


    }

    @Override
    public String toString() {
        return "BawKyim{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

