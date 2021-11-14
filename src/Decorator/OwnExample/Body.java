package Decorator.OwnExample;

public class Body extends Flesh{
    public static int countBody=0;
    public Body(People people){
        this.people=people;
    }
    @Override
    public String consistOf() {
        if (countBody>0) {
            --countBody;
            return people.consistOf() + ", body";
        }
        else{
            return people.consistOf();
        }
    }

    @Override
    public void counting() {
        countBody++;
        people.counting();
    }
}
