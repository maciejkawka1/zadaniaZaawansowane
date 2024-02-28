package zad7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Gun gun = new Gun(6);

        System.out.println("po utworzeniu status zaladowania: "+gun.isLoaded());

        gun.loadBullet("pierwszy");
        gun.loadBullet("drugi");
        gun.loadBullet("trzeci");
        gun.loadBullet("czwarty");
        gun.loadBullet("piaty");
        gun.loadBullet("szosty");

        System.out.println("po zaladowaniu: "+gun.isLoaded());
        try {
            System.out.println(gun.shot());
            System.out.println(gun.shot());
            System.out.println(gun.shot());

            System.out.println(gun.shot());
            System.out.println(gun.shot());
            System.out.println(gun.shot());

            System.out.println(gun.shot());

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


        System.out.println("po wystrzale : "+gun.isLoaded());



    }

}
