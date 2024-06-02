package factory;

import factory.coffee.Americano;
import factory.coffee.Coffee;
import factory.coffee.Espresso;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType coffeeType) throws IllegalArgumentException {
        Coffee coffee;
        switch (coffeeType) {
            case AMERICANO -> coffee = new Americano();
            case ESPRESSO -> coffee = new Espresso();
            default -> throw new IllegalArgumentException("Wrong coffee type");
        }
        return coffee;
    }

}
