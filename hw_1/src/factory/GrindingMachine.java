package factory;

import factory.coffee.Coffee;

public class GrindingMachine {

    private String grindSize;

    public void grind(Coffee coffee) {
        System.out.println("Started to grind coffee beans for " + coffee.getName());
        System.out.println(grindSize + " consistency");
    }

    public void setGrind(String grindSize) {
        this.grindSize = grindSize;
    }
}
