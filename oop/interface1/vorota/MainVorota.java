package oop.interface1.vorota;

public class MainVorota {
    public static void main(String[] args) {
        Pult Vorota = new Vorota();
        Vorota.moveDown();
        Vorota.moveleft();
        Vorota.moveright();
        Vorota.moveUp();

        VideoKamera videoKamera = new VideoKamera();
        videoKamera.moveDown();
        videoKamera.moveleft();
        videoKamera.moveright();
        videoKamera.moveUp();


    }
}
