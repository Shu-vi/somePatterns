package SpecialTask1.Task9;

public class TestDrive {
    /*
    Задание ООП
9. Перенести класс исключения в интерфейс IHelper и в этом же интерфейсе реализовать метод checkRole с использованием
данного исключения. Метод checkRole затем использовать в логике метода createQuery.
     */
    public static void main(String[] args) {
        User user = new User("log1","pas1");
        user.setConnections(User.INames.Connection.ESTABLISHED);
        user.setRights(User.INames.Rights.CUSTOMARY);
        user.createQuery();
        user.setRights(User.INames.Rights.RESTRICTED);
        user.createQuery();
    }
}
