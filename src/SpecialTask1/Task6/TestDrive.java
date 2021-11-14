package SpecialTask1.Task6;

public class TestDrive {
    /*
    Задание ООП
6. Переписать класс Query, используя вместо него внутренний или внешний интерфейс IQuery, содержащий внутренний статический
класс типа IQuery, реализующий метод printToLog.
     */
    public static void main(String[] args) {
        User user = new User("log1", "pas1");
        user.createQuery();
    }
}
