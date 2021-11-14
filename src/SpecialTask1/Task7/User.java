package SpecialTask1.Task7;

public class User {
    private String login;
    private  String password;
    private INames.Rights rights;
    private INames.Connection connections;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    void setRightsRestricted() {
        rights = INames.Rights.RESTRICTED;
    }

    void setRightsCustomary() {
        rights = INames.Rights.CUSTOMARY;
    }

    void setRightsIncreased() {
        rights = INames.Rights.INCREASED;
    }

    void setConnectionBroken() {
        connections = INames.Connection.BROKEN;
    }

    void setConnectionInstalled() {
        connections = INames.Connection.INSTALLED;
    }

    void setConnectionEstablished() {
        connections = INames.Connection.ESTABLISHED;
    }

    interface INames{
        enum Rights{
            RESTRICTED, CUSTOMARY, INCREASED;
        }
        enum  Connection{
            BROKEN, INSTALLED, ESTABLISHED;
        }
    }
}
