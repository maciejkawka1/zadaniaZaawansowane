package zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Java",18);
        mapa.put("Python",8);
        mapa.put("PHP",6);
        mapa.put("JS",7);
        mapa.put("C++",12);
        mapa.put("C#",20);

        showMap(mapa);
        System.out.println("--------------------");
        showMap2(mapa);

    }

    public static void showMap(Map<String,Integer> map){

        int i = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (i == map.size())
                System.out.println("klucz: " + entry.getKey() + ", Wartość: "+entry.getValue() + ".");
            else
                System.out.println("klucz: " + entry.getKey() + ", Wartość: "+entry.getValue() + ",");
            i++;
        }

    }

    public static <T> void  showMap2(Map<T,Integer> map){

        int i = 1;
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (i == map.size())
                System.out.println("klucz: " + entry.getKey() + ", Wartość: "+entry.getValue() + ".");
            else
                System.out.println("klucz: " + entry.getKey() + ", Wartość: "+entry.getValue() + ",");
            i++;
        }

    }
}
