package collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import  java.util.Set;

public class TaskSets {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Asan");
        name.add("Yson");
        name.add("Aman");
        name.add("Alim");
        name.add("Esen");
        System.out.println(name);

        HashSet<String> name1 = new HashSet<>(name);
        System.out.println(name1);

        Set<String> name2 = new TreeSet<>(name);
        System.out.println(name2);




    }

}
