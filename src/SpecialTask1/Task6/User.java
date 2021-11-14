package SpecialTask1.Task6;

public class User {
    private static String login;
    private static String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery.Query query = new IQuery.Query();
        query.printToLog();
    }

    public interface IQuery {
        public static class Query implements IQuery{
            void printToLog(){
                System.out.println("Пользователь с логином "+User.login+" и паролем "+User.password+" отправил запрос.");
            }
        }
    }
}
