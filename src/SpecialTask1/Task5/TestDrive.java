package SpecialTask1.Task5;

public class TestDrive {
    /*
    Задание ООП
5. Переписать класс Query, используя вместо него внешний интерфейс IQuery, содержащий статический метод printToLog.
     */
    public static void main(String[] args) {
        User user = new User("log1", "pas1");
        user.createQuery();
        User user2 = new User("log2", "pas2");
        user2.createQuery();
    }
}
