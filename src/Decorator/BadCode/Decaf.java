package Decorator.BadCode;

public class Decaf extends Beverage{
    public double cost(){
        price=0;
        if (isMilk()){
            price+=0.1;
        }
        if (isMocha()){
            price+=0.2;
        }
        if (isSoy()){
            price+=0.3;
        }
        if (isWhip()){
            price+=0.4;
        }
        price+=0.9;
        return price;
    }
}
