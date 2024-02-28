package zad5;

import java.util.LinkedList;
import java.util.List;

public class SDAHashSet<T> {

    private List<T> list;

    public SDAHashSet(){
        this.list = new LinkedList<>();
    }

    public int size(){
        return this.list.size();
    }

    public void clear(){
        this.list.clear();
    }

    public boolean contains(T element){
        return list.contains(element);
    }

    public boolean remove(T value){
        return this.list.remove(value);
    }

    public void add(T element){
        if (!this.contains(element)){
            this.list.add(element);
        }
    }

}
