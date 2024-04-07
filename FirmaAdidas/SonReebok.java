package FirmaAdidas;

public class SonReebok extends AdidasDad {
    public SonReebok(String name, int age, String typ, String season) {
        super(name, age, typ, season);
    }

    @Override
    public String design() {
        return "classik";

    }

    @Override
    public String toString() {
        return "SonReebok{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", typ='" + typ + '\'' +
                "season='" + getSeason() + '\'' +
                '}';
    }
    public SonReebok(String name,int age){
        super(name, age);
    }
}
