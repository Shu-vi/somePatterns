package Singleton.FinalStatic;

public class Singleton {
    private Singleton(){
        System.out.println(hashCode());
    }

    private static class SingCl{
        static final Singleton instance = new Singleton();
    }


    public static Singleton getInstance(){
        return SingCl.instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
    }
}
