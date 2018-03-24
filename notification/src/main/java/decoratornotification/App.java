package decoratornotification;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        notification n=new meet();
        Decorator d=new withWhom(n);
        d=new time(d);
        d=new venue(d);
        System.out.println(d.notifyUser());
        notification n1 =new eat();
        Decorator d1=new withWhom(n1);
        d1=new time(d1);
        d1=new venue(d1);
        System.out.println(d1.notifyUser());
    }
}
