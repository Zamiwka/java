package FirmaAdidas;

public class FirmaMain {
    public static void main(String[] args) {
        AdidasDad terrex = new AdidasDad("terrax",2024,"sport","winter");
        AdidasDad merrex = new AdidasDad("Merrex",2022);
        System.out.println(terrex);
        System.out.println(merrex);

        SonReebok nanox = new SonReebok("Nanox",2022,"classik","herbst");
        SonReebok nano1 = new SonReebok("Nano1",2024);
        System.out.println(nanox);
        System.out.println(nano1);
        System.out.println(nanox.design());

    }
}
