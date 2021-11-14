package Singleton.DelayedInitialization;

public class ChocolateBoiler{
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Заполнение нагревателя молочно-шоколадной смесью
            System.out.println("Заполнение");
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
            empty = true;
            System.out.println("Слив ");
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Довести содержимое до кипения
            boiled = true;
            System.out.println("Кипячение ");
        }
    }
    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }



    public static void main(String[] args) {
        ChocolateBoiler cb = ChocolateBoiler.getInstance();
        cb.fill();
        cb.boil();
        cb.drain();
    }
}
