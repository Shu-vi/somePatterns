package SpecialTask1.Task3;


public class User {
    private static String login;
    private  static String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        //создаём объект класса Query
        Query query = new Query();
        //вызываем метод printToLog
        query.printToLog();
    }

    static class Query{
        public void printToLog(){
            //печатает на консоль, что пользователь с таким-то логином и паролем отправил запрос
            System.out.println("Пользователь с логином "+User.login+" и паролем "+User.password+" отправил запрос.");
        }
    }
}
