package oop;

public class LapTop {
    String mark;
    String color;
    double price;

    public String code(){
        return "coding...";


    }

    @Override
    public String toString() {
        return "LapTop{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String typing() {
        return "typing....";
    }
        public String vyvod(){
            return "Mark:"+ mark +"color:" +color + "price:"+ price;
        }




    }
