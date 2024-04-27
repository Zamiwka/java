package oop.interface1.vorota;

import java.sql.SQLOutput;

public class VideoKamera implements Pult{
    @Override
    public void moveright() {
        System.out.println("napravo");

    }

    @Override
    public void moveleft() {
        System.out.println("nalevo");


    }

    @Override
    public void moveDown() {
        System.out.println("vniz");

    }

    @Override
    public void moveUp() {
        System.out.println("vverh");

    }
}
