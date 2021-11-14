package Observer.OwnExample;

import java.util.ArrayList;

public class Magazine implements Subject{
    ArrayList observers;
    String newBook;

    public Magazine(){
        observers = new ArrayList();
    }

    public void setNewBook(String newBook) {
        this.newBook = newBook;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i< observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(newBook);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }
}
