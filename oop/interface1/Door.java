package oop.interface1;

public class Door  implements Movable{
    @Override
    public void moveRigth() {
        System.out.println("OPen");
    }

    @Override
    public void moveLeft() {
        System.out.println("Close");

    }



    }

