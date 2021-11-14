package Decorator.BadCode;

public abstract class Beverage {
    protected String description;
    protected boolean milk;//добавки по 20 центов
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;
    protected double price;
    public String getDescription() {
        return description;
    }

    public Beverage(){}

    public abstract double cost();

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public double getPrice() {
        return price;
    }
}
