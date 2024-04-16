package oop.inheritance.strana;

public class Gorod {
    private UlitSa bokonbaeva;
    private UlitSa manas;

    public Gorod(){
        this.bokonbaeva = new UlitSa("Bokonbai");
        this.manas = new UlitSa("Manas");

    }

    public UlitSa getBokonbaeva() {
        return bokonbaeva;
    }

    public UlitSa getManas() {
        return manas;
    }

    @Override
    public String toString() {
        return "Gorod{" +
                "bokonbaeva=" + bokonbaeva +
                ", manas=" + manas +
                '}';
    }
}

