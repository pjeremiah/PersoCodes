public class Order2 extends FoodMenu {

    void MainMenu()
    {
        System.out.println("My Second Order is: ");
        Bowl = scannerOrder.nextLine();
        System.out.print("Your Serving Amount is: ");
        Serving = Integer.parseInt(scannerServing.nextLine());
    }
}
