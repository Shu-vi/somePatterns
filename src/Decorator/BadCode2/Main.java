package Decorator.BadCode2;

public class Main {
    public static void main(String[] args) {
        DecafWithSoy decafWithSoy = new DecafWithSoy();
        HouseBlendWithSteamedMilkAndMocha houseBlendWithSteamedMilkAndMocha = new HouseBlendWithSteamedMilkAndMocha();
        System.out.println(decafWithSoy.getDescription()+" $"+decafWithSoy.cost());
        System.out.println(houseBlendWithSteamedMilkAndMocha.getDescription()+" $"+houseBlendWithSteamedMilkAndMocha.cost());
    }
}
