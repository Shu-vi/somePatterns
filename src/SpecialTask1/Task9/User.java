package SpecialTask1.Task9;

public class User {
    private static String login;
    private  static String password;
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

    void createQuery() {
        try {
            IHelper.checkRole(rights, connections);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    interface INames{
        enum Rights{
            RESTRICTED, CUSTOMARY, INCREASED;
        }
        enum  Connection{
            BROKEN, INSTALLED, ESTABLISHED;
        }
    }

    interface IHelper{
        static void checkRole(INames.Rights rights, INames.Connection connections) throws NoRightsException, NoConnectionException{
            if (rights == INames.Rights.RESTRICTED)
                throw new NoRightsException("У пользователя недостаточно прав");
            if (connections == INames.Connection.BROKEN){
                throw new NoConnectionException("Проверьте подключение к интернету");
            }
            System.out.println("Пользователь с логином "+User.login+" и паролем "+User.password+" отправил запрос.");
        }

        class NoRightsException extends Exception {
            NoRightsException(String m){
                super(m);
            }
        }

        class NoConnectionException extends Exception {
            NoConnectionException(String m){
                super(m);
            }
        }
    }
}
