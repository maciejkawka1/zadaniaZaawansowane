package zad1;

import java.util.*;
import java.util.stream.Collectors;


//Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
public class Main {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("zamek");
        listaStringow.add("auto");
        listaStringow.add("kot");
        listaStringow.add("pies");
        listaStringow.add("wrota");
        listaStringow.add("listewka");
        listaStringow.add("drzwi");



        System.out.println("====Posortowana z Collections====");
        List<String> sorted = sortListCollections(listaStringow);
        sorted.forEach(System.out::println);

        System.out.println("====Posortowana z Stream====");
        List<String> sorted2 = sortListStream(listaStringow);
        sorted2.forEach(System.out::println);


        System.out.println("====Posortowana z metodą sort====");
        List<String> sorted3 = sortListSortMethod(listaStringow);
        sorted3.forEach(System.out::println);

        System.out.println("===Oryginał===");
        listaStringow.forEach(System.out::println);

    }

    public static List<String> sortListCollections(List<String> list){
        List<String> toSort = new ArrayList<>(list);
        Collections.sort(toSort);
        Collections.reverse(toSort);
        return toSort;
    }

    public static List<String> sortListStream(List<String> list){
        List<String> toSort = new ArrayList<>(list);

        return toSort.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    public static List<String> sortListSortMethod(List<String> list){
        List<String> toSort = new ArrayList<>(list);

        toSort.sort(Comparator.reverseOrder());
        return toSort;
    }


}
