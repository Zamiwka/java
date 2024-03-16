package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {
        // Map ---> No index(x) key,value
        Map<String,Integer> mobOperators = new HashMap<>();
        mobOperators.put("MegaCom",555);
        mobOperators.put("O!",700);
        mobOperators.put("Beeline",777);
        mobOperators.put("Beeline",771);
        System.out.println(mobOperators);//{Beeline=777, O!=700, MegaCom=555}

        // predictable order
        LinkedHashMap<Boolean,String> LinkedHashMap = new LinkedHashMap<>();
        LinkedHashMap.put(true,"yes");
        LinkedHashMap.put(false,"no");
        System.out.println(LinkedHashMap);

        TreeMap<Integer,String> students = new TreeMap<>();
        students.put(3, "ZArina");
        students.put(1,"Sanzhar");
        students.put(2,"ZAmira");
        System.out.println(students);


    }
}
