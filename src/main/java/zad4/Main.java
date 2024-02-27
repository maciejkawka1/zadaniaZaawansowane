package zad4;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("1","1");
        storage.addToStorage("2","2");
        storage.addToStorage("3","1");
        storage.addToStorage("1","x");
        storage.addToStorage("1","f");
        storage.addToStorage("3","b");

        storage.printValues("1");
        storage.printValues("2");
        storage.printValues("3");
        storage.printValues("purrr");

        storage.findValues("1");
    }
}
