package oop.interface1;

public class TvSet implements Movable{
    @Override
    public void moveRigth() {
        System.out.println("Dvigaisya vpravo");

    }

    @Override
    public void moveLeft(){
        System.out.println("dvigaisya na levo");

    }
    public void switchon(){
        System.out.println("vkluchaemsya televizor");
    }
    public void switchoff(){
        System.out.println("vykluchaem televizor");

    }

}
