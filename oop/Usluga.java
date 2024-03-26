package oop;

public class Usluga {
    public String name;
    public String master;
    public String color;
    public float time;
    public String design;
    public String strazi;
    public float bazovyiPrice;
    public float dopPrice;
    public String location;
    public int number;


    @Override
    public String toString() {
        return "Usluga{" +
                "name='" + name + '\'' +
                ", master='" + master + '\'' +
                ", color='" + color + '\'' +
                ", time=" + time +
                ", design='" + design + '\'' +
                ", strazi='" + strazi + '\'' +
                ", bazovyiPrice=" + bazovyiPrice +
                ", predPrice=" + dopPrice+
                ", location='" + location + '\'' +
                ", number=" + number +
                '}';
    }

    public float obwayasena() {
        return bazovyiPrice + dopPrice;

    }


    }

