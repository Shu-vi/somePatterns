package Decorator.GoodCode;

public class Whip extends CondimentDecorator{
    public Whip(Beverage b){
        beverage=b;
    }
    @Override
    public double cost() {
        return 0.4+ beverage.cost();
    }
    public String getDescription(){
        return beverage.getDescription()+", whip";
    }
}
