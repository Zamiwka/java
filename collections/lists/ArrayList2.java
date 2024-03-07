package collections.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Character> symbol = new ArrayList<>();
        symbol.add('!');
        symbol.add('N');
        symbol.add('^');
        symbol.add('*');
        symbol.add('N');
        symbol.add(')');
        System.out.println(symbol);
        symbol.remove(1);
        System.out.println(symbol);

        Iterator<Character> itr = symbol.iterator();
        System.out.println(itr);
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());

        //String      -- immutable
        // StringBulder --- mutable

    }
}
