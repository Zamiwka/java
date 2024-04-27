package oop.interface1.vorota;

public class  Vorota implements Pult{


    @Override
    public void moveright() {
        System.out.println("otkroi voroto");

    }

    @Override
    public void moveleft() {
        System.out.println("zakroi voroto");

    }

    @Override
    public void moveDown() {
        System.out.println("ostonovit");

    }

    @Override
    public void moveUp() {
        System.out.println("prodoljit");

    }
}
