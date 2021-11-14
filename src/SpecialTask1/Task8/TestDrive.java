package SpecialTask1.Task8;

public class TestDrive {
    /*
    Задание ООП
8. Создать внутренний приватный класс типа Exception, описывающий исключение если, например, у пользователя нет прав
отправлять запрос. Соответственно, переписать метод createQuery с реализацией данного исключения.
     */
    public static void main(String[] args) {
        User user = new User("1", "2");
        user.setConnections(User.INames.Connection.BROKEN);
        user.setRights(User.INames.Rights.CUSTOMARY);
        try {
            user.createQuery();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}