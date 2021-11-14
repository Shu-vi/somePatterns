package SpecialTask1.Task5;

public interface IQuery {
    static void printToLog(String log, String pass){
        System.out.println("Пользователь с логином "+log+" и паролем "+pass+" отправил запрос.");
    };
}

