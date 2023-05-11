package InterfaceInheritance;

public class Toyota implements Car
{

    @Override
    public void wiper() {
        // TODO Auto-generated method stub
        System.out.println("My Car is starting turning on the wiper");
    }

    @Override
    public void pass() {
        // TODO Auto-generated method stub
        System.out.println("My Car is doing a pass light signal");
    }

    
}
