package home_work;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        String[] name1 = new String[]{"Alihan", "Temirlan", "Michael", "Sacha"};
        String[] fio = new String[]{"Abdykerimov", "Obozkanov", "Bojev", "Sergeev"};
        int[] vosrast = new int[]{11,10,9,8,};
        Arrays.sort(vosrast);
        String[] classes = new String[]{"5A", "3B", "6C", "7A"};


        System.out.println("Содержимое массива:");
        for (int i = 0; i < name1.length; i++) {

            if (name1[i].equals("Tmirlan")) {
                System.out.println("Temirlan " + fio[i] + classes+vosrast);
            } else {
                System.out.println("imya: " + name1[i] + ", fio: " + fio[i] + ", class: " + classes[i]+  " vozrast: " + vosrast [i]);
            }

        }
    }
}

