public class Swap {
    public static void main(String[] args) {

        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.

        int a = 123;
        int b = 526;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        int swap;
        swap = a; // swap=123
        a = b;    // a=526
        b = swap; // b=123

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
