package SpecialTask1.Task3;

public class TestDrive {
    /*
    Задание ООП
3. Переписать класс Query, как статический класс.
     */
    public static void main(String[] args) {
        User user = new User("log1", "pas1");
        user.createQuery();
        User user2 = new User("log2", "pas2");
        user.createQuery();
        user2.createQuery();
    }
}
