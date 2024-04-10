package oop.encapsulation.KIno;

public class Cinema2 extends Cinema1 {
    public Cinema2(String name, int god, String akteri) {
        super(name, god, akteri);
    }

    public Cinema2(int god, String akteri) {
        super(god, akteri);
    }

    public int seria  (){
        return 25;


    }

    @Override
    public String toString() {
        return "Cinema2{" +
                "name='" + name + '\'' +
                ", god=" + god +
                ", gonorar=" + gonorar +
                ", akteri='" + akteri + '\'' +
                '}';
    }
}

