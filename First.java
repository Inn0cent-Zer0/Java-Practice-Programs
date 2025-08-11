import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class First {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter screen= new PrintWriter(System.out,true);
    public static void main(String[]args) throws IOException {
        String Food;
        float Price = 0;
        boolean InputError= false;
        System.out.println("Select any of the food from the menu given below\n");
        System.out.println("Eggs\tPancakes\tBagel\tMuffin");
        System.out.println("Yogurt\tHash\tToast\tFries");
        System.out.println("Tea\tCoffee\tChocoloate");
        screen.println("Enter any of the options from the above");
        screen.flush();
        Food= keyboard.readLine();
        Food= Food.toUpperCase();
        switch (Food) {
            case "EGGS" -> Price = 2.75f;
            case "PANCAKES" -> Price = 4.00f;
            case "MUFFIN", "CHOCOLATE" -> Price = 0.95f;
            case "BAGEL" -> Price = 1.50f;
            case "YOGURT", "FRIES" -> Price = 1.00f;
            case "HASH" -> Price = 1.75f;
            case "TOAST", "TEA", "COFFEE" -> Price = 0.75f;
            default -> {
                InputError = true;
                if (InputError) {
                    screen.println("\nFood not listed in menu\n");
                } else {
                    screen.println("\nThe price of a" + Food + "is $" + Price);
                }
            }
        }
    }
}