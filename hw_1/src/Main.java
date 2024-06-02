import factory.CoffeeFactory;
import factory.CoffeeMachine;
import factory.CoffeeType;
import factory.GrindingMachine;
import singelton.Logger;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testSingleton();
        testFactory();


    }

    private static void testSingleton() {
        Logger logger = Logger.getInstance();
        logger.classLogg(new ArrayList<>(), "Created an array");
    }

    private static void testFactory() {
        GrindingMachine grindingMachine = new GrindingMachine();
        CoffeeMachine coffeeMachine = new CoffeeMachine(grindingMachine);
        coffeeMachine.start(CoffeeType.AMERICANO);
    }
}