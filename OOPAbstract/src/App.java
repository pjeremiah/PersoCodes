public class App {

    public static void main(String[] args) {

        FoodMenu Ord1 = new Order1();
        FoodMenu Ord2 = new Order2();

        Ord1.MainMenu();
        Ord2.MainMenu();

        Ord1.GetOrder();
        Ord2.GetOrder();
        Ord2.GetAmountOfServing();

    }
}