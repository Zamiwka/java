package oop.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Dad asan = new Dad("Asan",99,"stright","dlinnyi");
        Dad uson = new Dad("Uson",67);
        System.out.println(asan);
        System.out.println(uson);
        Son bektur = new Son("Bektur",45,"gorbatyi","pryamye");
        Son tilek = new Son("Tilek",20);
        System.out.println(bektur);
        System.out.println(tilek);
        System.out.println(bektur.talent());
        System.out.println("----------");
        GrandSon bek = new GrandSon("Bek",7,"pryamoi","kudryavyi");
        System.out.println(bek);
        System.out.println(bek.talent());

        System.out.println("-----------");

        Dad meken = new Son("Meken",12,"gorbatyi","korotkie");
        System.out.println(meken);
        System.out.println(meken.talent());
        Dad beken = new GrandSon("Beken",32,"gorbatyi","cyrly");
        System.out.println(beken);
        System.out.println(beken.talent());
    }
}
