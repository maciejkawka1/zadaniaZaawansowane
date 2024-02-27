package zad1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("zamek");
        listaStringow.add("kot");
        listaStringow.add("pies");
        listaStringow.add("wrota");
        listaStringow.add("listewka");
        listaStringow.add("drzwi");

        listaStringow.forEach(System.out::println);

        System.out.println("====Posortowana z Collections====");
        List<String> sorted = sortListCollections(listaStringow);
        sorted.forEach(System.out::println);

        System.out.println("====Posortowana z Stream====");
        List<String> sorted2 = sortListStream(listaStringow);
        sorted2.forEach(System.out::println);


    }

    public static List<String> sortListCollections(List<String> list){
        List<String> toSort = new ArrayList<>(list);
        Collections.sort(toSort);
        return toSort;
    }

    public static List<String> sortListStream(List<String> list){
        List<String> toSort = new ArrayList<>(list);

        return toSort.stream().sorted().collect(Collectors.toList());
    }
}
