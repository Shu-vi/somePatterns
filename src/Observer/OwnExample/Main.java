package Observer.OwnExample;

public class Main {
    public static void main(String[] args) {
        Magazine shop = new Magazine();
        Client1 client1 = new Client1();
        Client2 client2 = new Client2();
        shop.registerObserver(client1);
        shop.registerObserver(client2);
        shop.setNewBook("Alice");
        shop.setNewBook("Bob");
        shop.removeObserver(client1);
        shop.setNewBook("Shuvi");
        shop.removeObserver(client2);
        shop.setNewBook("Perishko");
        for (int i=0; i<5; i++){
            System.out.println(client1.books[i]+ " "+ client2.books[i]);
        }
    }
}
