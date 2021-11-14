package Observer.OwnExample;

public class Client2 implements Observer{
    String[] books = new String[5];
    int i=-1;
    public void update(String book) {
        books[++i]= book;
    }
}
