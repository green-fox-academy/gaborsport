public class FizzBuzz {
    public static void main(String[] args) {
        // Írj egy programot, ami 1-től 100-ig kiíratja a számokat.
// De a 3 többszörösei esetén a "Fizz" szót írja ki a szám helyett
// és az 5 többszöröseinél pedig a "Buzz" szót írja ki a szám helyett.
// Ha a szám a 3-nak és 5-nek is többszöröse,
// akkor a "FizzBuzz" szót írja ki a szám helyett

        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

       /* for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i);
            }
            System.out.println();*/

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }
}
