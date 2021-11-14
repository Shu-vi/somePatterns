package Decorator.GoodCode;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Milk(new Milk(new Mocha(new Whip(new Decaf())))).cost()+" "+new Milk(new Milk(new Mocha(new Whip(new Decaf())))).getDescription());
    }
}
