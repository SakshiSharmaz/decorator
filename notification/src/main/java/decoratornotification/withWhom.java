package decoratornotification;

public class withWhom extends Decorator {
    notification n;

    public withWhom(notification n) {
        this.n = n;
    }

    public String notifyUser() {

        return n.notifyUser()+" a friend" ;
    }
}
