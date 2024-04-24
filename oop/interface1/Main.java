package oop.interface1;

public class Main {
    public static void main(String[] args) {
        Movable movable = new TvSet();
        movable.moveLeft();
        movable.moveRigth();


        TvSet tvSet = new TvSet();
        tvSet.switchon();
        tvSet.switchoff();
        tvSet.moveLeft();
        tvSet.moveRigth();

        Movable movabledoor = new Door();
        movabledoor.moveRigth();
        movabledoor.moveLeft();
    }
}
