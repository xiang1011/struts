package action;
public class HelloWorldAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String sayHi() {

        return SUCCESS;

    }

    public String execute() {
        return SUCCESS;
    }
}
