package decoratornotification;

public class time extends Decorator{
    notification n;

    public time(notification n) {
        this.n = n;
    }

    public String notifyUser() {

        return n.notifyUser()+" at 10 0' clock" ;
    }
}
