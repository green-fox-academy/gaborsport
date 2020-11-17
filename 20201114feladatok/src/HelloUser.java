import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String userName = "Gábor";
        System.out.println("Hello " + userName + "!");
    }
}
