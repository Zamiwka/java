package oop.encapsulation;

public class TurAgentstvo {
    public String name;
    private String location;
    public String uslugi;
    public int price;
    private double rating;



    @Override
    public String toString() {
        return "TurAgentstvo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", uslugi='" + uslugi + '\'' +
                ", price=" + price +
                ", reiting=" + rating +
                '}';
    }

    public TurAgentstvo(String name, String location, String uslugi, int price, double reiting) {
        this.name = name;
        this.location = location;
        this.uslugi = uslugi;
        this.price = price;
        this.rating = reiting;
    }

    public double getRating() {
        return rating;
    }

    public String getLocation() {
        if (location != "Kyrgysystan") {
            return location;
        } else {
            return "nepravilnaya location";
        }
    }

    public int getPrice() {
        return price;

    }


}
