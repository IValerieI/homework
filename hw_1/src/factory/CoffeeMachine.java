package factory;

import factory.coffee.Coffee;

public class CoffeeMachine {

    private final GrindingMachine grindingMachine;

    public CoffeeMachine(GrindingMachine grindingMachine) {
        this.grindingMachine = grindingMachine;
    }

    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);

        System.out.println("\nCoffee machine works" );

        setGrindSize(coffee.getGrindSize());
        grindingMachine.grind(coffee);
        boilWater();
        brewCoffee();

        System.out.println("Coffee is ready");

    }

    private void getType() {
        System.out.println("Brewing coffee");
    }

    private void boilWater() {
        System.out.println("Boiling water for coffee");
    }

    private void setGrindSize(String grindSize) {
        grindingMachine.setGrind(grindSize);
    }

    private void brewCoffee() {
        System.out.println("Brewing coffee");
    }


}
