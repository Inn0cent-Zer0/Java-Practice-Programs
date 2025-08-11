import java.io.IOException;
import java.util.Scanner;

public class CityGuide {
    public static void main(String[] args) {
        char Choice;
        System.out.println("Select from the Option below");
        System.out.println(" M -> Madras");
        System.out.println(" B -> Bombay");
        System.out.println(" C -> Calcutta");
        System.out.println("Choice --->");
        System.out.flush();
        try {
            switch (Choice = (char) System.in.read()) {
                case 'M', 'm' -> System.out.println("Madras : Booklet 5");
                case 'b', 'B' -> System.out.println("Bombay : Booklet 9");
                case 'C', 'c' -> System.out.println("Calcutta : Booklet 18");
                default -> System.out.println("Invalid Choice (IC)");
            }
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }
}