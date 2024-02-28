package zad6;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer,String> tree = new TreeMap<>();
        tree.put(1,"pierwszy");
        tree.put(2,"drugi");
        tree.put(3,"trzeci");
        tree.put(4,"czwarty");
        tree.put(5,"piaty");
        tree.put(6,"szosty");
        showFirstAndLast(tree);
    }

    public static void showFirstAndLast(TreeMap<Integer, String> map){
        Map.Entry<Integer,String> entry = map.firstEntry();
        System.out.println(entry.getKey() + "  "+ entry.getValue());
        entry = map.lastEntry();
        System.out.println(entry.getKey() + "  "+ entry.getValue());
    }


}
