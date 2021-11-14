package Decorator.GoodCode;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage b){
        beverage=b;
    }
    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
    public String getDescription(){
        return beverage.getDescription()+", mocha";
    }
}
