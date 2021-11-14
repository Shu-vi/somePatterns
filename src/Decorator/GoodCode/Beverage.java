package Decorator.GoodCode;

public abstract class Beverage {
    protected String description;
    public String getDescription() {
        return description;
    }

    public Beverage(){}

    public abstract double cost();

}