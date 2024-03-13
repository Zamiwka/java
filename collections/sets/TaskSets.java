package collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class TaskSets {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Asan");
        name.add("Yson");
        name.add("Seitek");
        name.add("Semetei");
        name.add("Sanirabiga");
        name.add("Sanjar");
        name.add("AnARBEK");
        name.add("Esentai");
        System.out.println("Spisok Imen:");
        System.out.println(name);

        HashSet<String> name1 = new HashSet<>(name);
        System.out.println("HashSet (name1) with length > 5:");
        for (String tamga : name1) {
            if (tamga.length() > 5) {
                System.out.println(tamga);
            }
        }
         HashSet<String> name2 = new HashSet<>(name);
         System.out.println("HashSettin uzundugu < 5:");
         for (String tamga2 : name2) {
         if  (tamga2.length() < 5) {
                System.out.println(tamga2);


            }
        }
    }
}
