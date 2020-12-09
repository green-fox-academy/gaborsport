import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot

     /*   int storedNumber = 13;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Találd ki a számot:");
        int numberGuess = scanner.nextInt();
        if (storedNumber > numberGuess) {
            System.out.println("A tárolt szám nagyobb"); }
            System.out.println("Találd ki a számot:");
            numberGuess = scanner.nextInt();

        if (storedNumber < numberGuess) {
            System.out.println("A tárolt szám kisebb"); }
        System.out.println("Találd ki a számot:");
        numberGuess = scanner.nextInt();
        while (storedNumber == numberGuess) {
            System.out.println("Eltaláltad a számot");
        }*/
        Scanner sc = new Scanner(System.in);

        int number = 13;

        System.out.println("Gondoltam egy számra. Tippelj!");

        int userTip = sc.nextInt();

        while (userTip != number)
        {
            System.out.println((number > userTip ? "A tárolt szám nagyobb" : "A tárolt szám kisebb"));
            userTip = sc.nextInt();
        }

        System.out.println("Eltaláltad a számot");
    }



}
