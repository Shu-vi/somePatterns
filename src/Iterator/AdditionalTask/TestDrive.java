package Iterator.AdditionalTask;


public class TestDrive {
    public static void main(String[] args) {
        A a = new A(10, 12.5);
        Iterator iterator = a.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()); //перебрать поля классов A и B
        }
    }

}
