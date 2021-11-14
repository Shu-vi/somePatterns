package SpecialTask1.Task7;

public class TestDrive {
    /*
    Задание ООП
7. Создать внутренний интерфейс INames, как пространство имен для данной предметной области, а именно,
содержащий Enum и константы (например, типы прав доступа пользователей, строка соединения и т.д.)
     */
    public static void main(String[] args) {
        User user = new User("log1", "pas1");
        user.setConnectionBroken();
        user.setRightsCustomary();
    }
}
