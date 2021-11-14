package Decorator.OwnExample;

public class Hand extends Flesh{
    public static int countHand=0;
    public Hand(People people){
        this.people=people;
    }
    @Override
    public String consistOf() {
        if (countHand>0) {
            countHand--;
            return people.consistOf() + ", hand";
        }
        else{
            return people.consistOf();
        }
    }

    @Override
    public void counting() {
        countHand++;
        people.counting();
    }
}
