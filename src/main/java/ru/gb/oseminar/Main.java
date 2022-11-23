package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        List<Product> bottles = new ArrayList<>(Arrays.asList(
                new BottleOfWater("Coca-Cola", 10.0, 0.5),
                new BottleOfWater("Sprite", 13.0, 0.4))
        );
        VendingMachine bottleMachine = new VendingMachine (bottles);
        Logger log = Logger.getLogger(Main.class.getName());
        log.info(bottleMachine.getProductByName("Coca-Cola").toString());

        List<Product> HotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Cappuccino", 20.0, 0.3, 43),
                new HotDrink("Latte", 22.0, 0.4, 43),
                new HotDrink("Green tea", 15.0, 0.5,42),
                new HotDrink("Green tea with lemon", 17.0, 0.5,42))
        );
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(HotDrinks);
        log.info(hotDrinkMachine.getProductByName("Latte").toString());
        log.info(hotDrinkMachine.getProduct("Green tea with lemon", 0.5, 42).toString());
    }
}