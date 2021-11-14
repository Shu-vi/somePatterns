package SpecialTask1.Task8;

public class User {
    private String login;
    private  String password;
    public INames.Rights rights;
    public INames.Connection connections;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setRights(INames.Rights rights) {
        this.rights = rights;
    }

    public void setConnections(INames.Connection connections) {
        this.connections = connections;
    }

    void createQuery() throws NoRightsException, NoConnectionException{
        if (rights == INames.Rights.RESTRICTED)
            throw new NoRightsException("У пользователя недостаточно прав");
        if (connections == INames.Connection.BROKEN){
            throw new NoConnectionException("Проверьте подключение к интернету");
        }
        System.out.println("Пользователь с логином "+User.this.login+" и паролем "+User.this.password+" отправил запрос.");
    }

    interface INames{
        enum Rights{
            RESTRICTED, CUSTOMARY, INCREASED;
        }
        enum  Connection{
            BROKEN, INSTALLED, ESTABLISHED;
        }
    }

    private class NoRightsException extends Exception {
        NoRightsException(String m){
            super(m);
        }
    }

    private class NoConnectionException extends Exception {
        NoConnectionException(String m){
            super(m);
        }
    }
}
