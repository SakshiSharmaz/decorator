package decoratornotification;

public class venue extends Decorator {
    notification n;

    public venue(notification n) {
        this.n = n;
    }

    public String notifyUser() {

        return n.notifyUser()+" at hotel RoyalPalace " ;
    }
}
