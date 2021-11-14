package Decorator.GoodCode;

public class Milk extends CondimentDecorator{
    public Milk(Beverage b){
        this.beverage=b;
    }
    @Override
    public double cost() {
        return 0.1+beverage.cost();
    }
    public String getDescription(){
        return beverage.getDescription()+", milk";
    }
}
