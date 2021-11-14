package Decorator.OwnExample;


public class God {
    public static void main(String[] args) {
        People people = new Katya();
        people = new Body(people);
        people = new Head(people);
        people = new Hand(people);
        people = new Hand(people);
        people = new Foot(people);
        people = new Foot(people);
        people = new Body(people);
        people = new Head(people);
        people = new Hand(people);
        people = new Hand(people);
        people = new Foot(people);
        people = new Foot(people);
        people = new Body(people);
        people = new Head(people);
        people = new Hand(people);
        people = new Hand(people);
        people = new Foot(people);
        people = new Foot(people);
        people.counting();
        System.out.println(people.consistOf());
        People people2 = new Vasya();
        people2 = new Body(people2);
        people2 = new Head(people2);
        people2 = new Hand(people2);
        people2 = new Foot(people2);
        people2 = new Foot(people2);
        people2 = new Body(people2);
        people2 = new Head(people2);
        people2 = new Hand(people2);
        people2 = new Foot(people2);
        people2 = new Foot(people2);
        people2.counting();
        System.out.println(people2.consistOf());


        //TODO считывать из файла и контролировать количество частей
        //TODO properties
    }
}