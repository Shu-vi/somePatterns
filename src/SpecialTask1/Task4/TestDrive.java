package SpecialTask1.Task4;

public class TestDrive {
    /*
    Задание ООП
4. Переписать класс Query как анонимный, расширяющий интерфейс IQuery, создав внутренний интерфейс IQuery,
содержащий дефолтный метод printToLog.
     */
    public static void main(String[] args) {
        User user = new User("log1", "pas1");
        user.createQuery();
    }
}
