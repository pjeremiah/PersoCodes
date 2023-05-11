import java.io.*;
import java.util.Scanner;

public abstract class FoodMenu {

    Scanner scannerOrder = new Scanner(System.in);
    Scanner scannerServing = new Scanner(System.in);
    String Bowl;
    int Serving;

    abstract void MainMenu();

    void SetOrder(String Bowl) {
        this.Bowl = Bowl;

    }
    void GetOrder(){
        System.out.println("Here is your Order: " + Bowl);

    }
    void SetAmountOfServing(int Serving) {
        this.Serving = Serving;
    }

    void GetAmountOfServing() {
        System.out.println("Here is the Amount of Serving: " + Serving);
    }

    }
