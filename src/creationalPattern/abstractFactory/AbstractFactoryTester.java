package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.interfaces.FurnitureFactory;

import java.util.Scanner;

public class AbstractFactoryTester {
    private static Store getStore(String input){
        Store store;
        if(input.equals("Plain")){
            store = new Store(new PlainFurnitureFactory());
        } else if (input.equals("Fancy")) {
            store = new Store(new FancyFurnitureFactory());
        }
        else {
            store = new Store(new EconomicalFurnitureFactory());
        }

        return store;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = getStore(scanner.next());
        store.getFeatures();
    }
}
