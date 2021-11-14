package SpecialTask1.Task4;


public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery query = new IQuery() {
            @Override
            public void printToLog() {
                System.out.println("Пользователь с логином "+User.this.login+" и паролем "+User.this.password+" отправил запрос.");
            }
        };
        query.printToLog();
    }

    interface IQuery{
        default void printToLog(){

        }
    }
}
