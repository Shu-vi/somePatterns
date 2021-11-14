package Decorator.BadCode2;

public class HouseBlendWithSteamedMilkAndMocha extends Beverage{
    public HouseBlendWithSteamedMilkAndMocha(){
        this.description="HouseBlendWithSteamedMilkAndMocha";
    }
    @Override
    public double cost() {
        return 1.49;
    }
}
