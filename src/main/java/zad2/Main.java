package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Stwórz metodę, która jako parametr przyjmuje listę stringów,
    // następnie zwraca tą listę posortowaną alfabetycznie od Z do A
    // nie biorąc pod uwagę wielkości liter.
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("Kot");
        listaStringow.add("pies");
        listaStringow.add("Aligator");
        listaStringow.add("Żyrafa");
        listaStringow.add("słoń");
        List<String> posortowanaLista = sortListZtoAsort(listaStringow);

        System.out.println("Posortowana lista: " + posortowanaLista);


    }


    public static List<String> sortListZtoA(List<String> lista) {
        Collections.sort(lista, (str1, str2) -> str2.compareToIgnoreCase(str1));
        return lista;
    }

    public static List<String> sortListZtoAsort(List<String> lista) {
        lista.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        return lista;
    }
}
