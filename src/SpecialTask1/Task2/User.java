package SpecialTask1.Task2;


public class User {
    private String login;
    private  String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        class Query{
            public void printToLog(){
                //печатает на консоль, что пользователь с таким-то логином и паролем отправил запрос
                System.out.println("Пользователь с логином "+User.this.login+" и паролем "+User.this.password+" отправил запрос.");
            }
        }
        //создаём объект класса Query
        Query query = new Query();
        //вызываем метод printToLog
        query.printToLog();
    }

}
