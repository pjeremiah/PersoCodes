package InterfaceInheritance;

public class MainAppInterface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car c = new Toyota();
        Car h = new Honda();

        c.wiper();
        c.pass();

        h.HondaStart();
        h.HondaDrive();

    }
}