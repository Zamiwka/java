package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {
        // Map ---> No index(x) key,value
        Map<String, Integer> mobOperators = new HashMap<>();
        mobOperators.put("MegaCom", 555);
        mobOperators.put("O!", 700);
        mobOperators.put("Beeline", 777);
        mobOperators.put("Beeline", 771);
        System.out.println(mobOperators);//{Beeline=777, O!=700, MegaCom=555}

        // predictable order
        LinkedHashMap<Boolean, String> LinkedHashMap = new LinkedHashMap<>();
        LinkedHashMap.put(true, "yes");
        LinkedHashMap.put(false, "no");
        System.out.println(LinkedHashMap);

        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(3, "ZArina");
        students.put(1, "Sanzhar");
        students.put(2, "ZAmira");
        System.out.println(students);
    }

    //sleepIn
    public static boolean sleepIn(boolean weekday, boolean vacation) {

            if (!weekday || vacation) {
                return true;
            }

            return false;

        }
    //  monkey
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }
    public static int sumDouble(int a, int b) {
        int summa = a + b;
        if (a == b) {
            summa = summa * 2;
        }
            return summa;
        }
    public  static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
//    public static boolean parrotTrouble(boolean talking, int hour) {
//            return(talking && (hour < 7 || hour  > 20));
//
//        }
//        public static boolean makes10(int a, int b) {
//            return (a == 10 || b == 10 || a + b == 10);

        }
    public static boolean hasTeen(int a, int b, int c) {
        return(a>=13 && a<=19) || (b>=13 && b<19) || (c>=13 && c<=19);

    }
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a>=13 && a <=19);
        boolean bTeen = (b>= 13 && b <=19);
        return(aTeen && !bTeen) || (!aTeen && bTeen);
    }
    public  static String delDel(String str) {
        if (str.length()>=4 && str.substring(1 ,4).equals("del")) {
            return str.substring(0 ,1) + str.substring(4);

        }
        return str;
    }
    public static boolean mixStart(String str) {
        if (str.length()<3) return false;
        String two = str.substring(1,3);
        if(two.equals("ix")) {
            return true;
        } else {
            return false;

        }

    }
    public static String startOz(String str) {
        String result ="";
        if(str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);

        }
        if (str.length() >=2 && str.charAt(1) == 'z'){
            result = result + str.charAt(1);

        }
        return result;

    }
    public static int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);
        if(diffA < diffB) {
            return a;
        }
        if(diffB < diffA) {
            return b;
        }
        return 0;// i.e. diffA == diffB
    }






}

