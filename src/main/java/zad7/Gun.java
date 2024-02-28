package zad7;

import java.util.ArrayList;

public class Gun {

    private int size;
    private ArrayList<String> bullets;

    public Gun(int size){
        this.size = size;
        this.bullets = new ArrayList<>();
    }


    public boolean loadBullet(String bullet){

        if(this.bullets.size() == this.size)
            return false;
        else{
            this.bullets.add(bullet);
            return true;
        }


    }

    public boolean isLoaded(){
        return !this.bullets.isEmpty();
    }

    public String shot(){
        if(!this.bullets.isEmpty()){
            int lastBullet = this.bullets.size() - 1;
            String bullet = this.bullets.get(lastBullet);
            this.bullets.remove(lastBullet);
            return bullet;
        }
        else
            throw new IndexOutOfBoundsException("Pusty magazynek");


    }

}
