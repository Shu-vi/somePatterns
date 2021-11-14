package Decorator.BadCode2;

public class DecafWithSoy extends Beverage{

    public DecafWithSoy(){
        this.description="DecafWithSoy";
    }
    @Override
    public double cost() {
        return 1.12;
    }
}
