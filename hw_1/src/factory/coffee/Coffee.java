package factory.coffee;

public abstract class Coffee {

    public abstract String getGrindSize();

    public String getName() {
        return getClass().getSimpleName();
    }

}
