package oop.enum1.svetafor;

public class MainSvetofor {
    public static void main(String[] args) {
        Svetofor svetofor = Svetofor.JELTYI;
        System.out.println(svetofor);

        Ahunbaeva current =  new Ahunbaeva("ulitsa",100,Svetofor.KRASNYI);
        System.out.println(current);

        System.out.println(current.getSvetofor());
         for (Svetofor a: Svetofor.values()){
             System.out.println(a);
         }



    }
}
