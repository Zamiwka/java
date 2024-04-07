package FirmaAdidas;

public class AdidasDad {
    public String name;
    protected  int age;
    String typ;
    private String season;

    public AdidasDad(String name, int age, String typ, String season) {
        this.name = name;
        this.age = age;
        this.typ = typ;
        this.season = season;
    }

    public AdidasDad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String design(){
        return "sport";

    }

    @Override
    public String toString() {
        return "AdidasDad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", typ='" + typ + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
