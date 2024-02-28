package zad8;

public class Main {

    public static void main(String[] args) {
        Parcel valid = new Parcel(40,40,40,28,false);
        Parcel invalid = new Parcel(40,40,40,17,true);

        Parcel invalid2 = new Parcel(20,40,40,28,false);

        ParcelValidator parcelValidator = new ParcelValidator();

        System.out.println(parcelValidator.validate(valid));
        System.out.println(parcelValidator.validate(invalid));

        System.out.println(parcelValidator.validate(invalid2));

    }

}
