package constructors;

public class Dom {

    public String type;
    public  boolean ogorod;
    public int kvm2;
    public int jiteli;
    public  int  rooms;


    @Override
    public String toString() {
        return "Dom{" + "\n " +
                "type='" + type + '\'' +
                ", ogorod=" + ogorod +
                ", kvm2=" + kvm2 +
                ", jiteli=" + jiteli +
                ", rooms=" + rooms +
                '}';
    }

    public Dom(String type1, int kvm22, int jiteli1, int rooms1){
        type = type1;
        kvm2 = kvm22;
        jiteli = jiteli1;
        rooms = rooms1;




    }


}
