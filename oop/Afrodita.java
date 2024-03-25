package oop;

public class Afrodita {
    public static void main(String[] args) {
        Usluga wellak = new Usluga();
        wellak.master = "Ainura";
        wellak.number =  555_85_23_44;
        wellak.location = "Bischkek ul Gorkogo 45";
        wellak.name = "french";
        wellak.strazi = "blesky";
        wellak.color = "rozavyi";
        wellak.design = "pantera";
        wellak.dopPrice = 300;
        wellak.time = 1.5f;
        wellak.bazovyiPrice = 500;


        float itogo = wellak.obwayasena();
        System.out.println("itogovaya sena: " + itogo);
        System.out.println(wellak);
        System.out.println(wellak.number);
    }
}
