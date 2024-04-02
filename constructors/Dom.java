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
        this.type = type1;
        this.kvm2 = kvm22;
        this.jiteli = jiteli1;
        this.rooms = rooms1;




    }
    public Dom(String type,int kvm2){
        this.type = type;
        this.kvm2 = kvm2;


    }


}
