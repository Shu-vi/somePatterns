package Decorator.BadCode;


public class Main {
    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        DarkRoast darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        houseBlend.setMilk(true);
        houseBlend.setWhip(true);
        System.out.println(houseBlend.cost());
        darkRoast.setMocha(true);
        darkRoast.setSoy(true);
        System.out.println(darkRoast.cost());
        System.out.println(decaf.cost());
        espresso.setMilk(true);
        espresso.setMocha(true);
        espresso.setSoy(true);
        espresso.setWhip(true);
        System.out.println(espresso.cost());
    }
}
