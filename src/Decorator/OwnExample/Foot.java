package Decorator.OwnExample;

public class Foot extends Flesh{
    public static int countFoot=0;
    public Foot(People people){
        this.people=people;
    }
    @Override
    public String consistOf() {
        if (countFoot>0) {
            countFoot--;
            return people.consistOf() + ", foot";
        }
        else{
            return people.consistOf();
        }
    }
    @Override
    public void counting() {
        countFoot++;
        people.counting();
    }
}
