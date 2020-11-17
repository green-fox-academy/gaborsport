
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        Scanner scanner = new Scanner(System.in);
        double numberMile = scanner.nextDouble();
        System.out.println("Távolság km-ben: " + (1.609344 * numberMile) + "km");


    }
}
