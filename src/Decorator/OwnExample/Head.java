package Decorator.OwnExample;

public class Head extends Flesh{
    public static int countHead=0;
    public Head(People people){
        this.people=people;
    }
    @Override
    public String consistOf() {
        if (countHead>0) {
            countHead--;
            return people.consistOf() + ", head";
        }
        else{
            return people.consistOf();
        }
    }

    @Override
    public void counting() {
        countHead++;
        people.counting();
    }
}
