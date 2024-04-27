package oop.enum1.svetafor;

public class Ahunbaeva {
    public String name;
    public int quantity;
    private Svetofor svetofor;

    public Ahunbaeva(String name, int quantity, Svetofor svetofor) {
        this.name = name;
        this.quantity = quantity;
        this.svetofor = svetofor;
    }


    @Override
    public String toString() {
        return "Ahunbaeva{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", svetafor=" + svetofor +
                '}';
    }
    String getSvetofor() {
        switch (svetofor) {
            case KRASNYI:
                return "RED";
            case ZELENYI:
                return "GREEN";
            case JELTYI:
                return "YELLOW";

            default:
                return "GREEN";
        }

    }


}
