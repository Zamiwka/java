package oop.encapsulation.KIno;

public class Cinema1 {
    public  String name;
    public int god;
    protected int gonorar;
    public String akteri;

    public Cinema1(String name, int god, String akteri) {
        this.name = name;
        this.god = god;
        this.akteri = akteri;
    }

    public Cinema1(int god, String akteri) {
        this.god = god;
        this.akteri = akteri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGonorar() {
        return gonorar;
    }

    public void setGonorar(int gonorar) {
        this.gonorar = gonorar;
    }

    @Override
    public String toString() {
        return "Cinema1{" +
                "name='" + name + '\'' +
                ", god=" + god +
                ", gonorar=" + gonorar +
                ", akteri='" + akteri + '\'' +
                "gonorar='" + gonorar + '\'' +
                '}';
    }
}

