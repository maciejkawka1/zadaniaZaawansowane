package zad4;

import java.util.*;

public class Storage {

    private Map<String, List<String>> map;

    public Storage(){
        map = new HashMap<>();
    }

    public void addToStorage(String key, String value){

        map.computeIfAbsent(key, x -> new ArrayList<>()).add(value);
    }

    public void printValues( String key){

        if (map.containsKey(key)){
            System.out.println("Dla wartości klucza: "+key+" znaleziono następujące wartości: ");
            System.out.println(map.get(key));
        }


    }
    public void findValues(String value){
        List<String> keyResults = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()){

            entry.getValue().forEach(v -> {
                if(v.equals(value))
                    keyResults.add(entry.getKey());
            });

        }
        if(!keyResults.isEmpty())
            System.out.println("Dla wartości: "+value + " znaleziono poniższe klucze: "+ keyResults);
    }
}
