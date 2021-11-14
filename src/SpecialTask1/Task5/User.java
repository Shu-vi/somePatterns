package SpecialTask1.Task5;



public class User {
    private String login;
    private  String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery.printToLog(login, password);
    }
}
