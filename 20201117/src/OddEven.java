import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }

    }
}
