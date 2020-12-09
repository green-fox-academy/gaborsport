import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int number1 = scanner.nextInt();
        System.out.println("Kérek egy másik egész számot:");
        int number2 = scanner.nextInt();

        if (number2 <= number1) {
            System.out.println("A második számnak nagyobbnak kellene lennie!");
            System.out.println("Kérem még egyszer egy első számot:");
            number1 = scanner.nextInt();
            System.out.println("Kérem még egyszer egy második számot:");
            number2 = scanner.nextInt();
            for (int i = number1; i < number2 ; i++) {
                System.out.println(i);

            }
        }

        else {
            for (int i = number1; i < number2 ; i++) {
                System.out.println(i);
            }
            }

    }
}
