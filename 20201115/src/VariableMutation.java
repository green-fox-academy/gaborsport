public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        //Növeld meg az "a" változó értékét 10-zel
        a += 10;
        System.out.println(a);

        int b = 100;
        //Csökkentsd a "b" változó érétékét 7-tel
        b -= 7;
        System.out.println(b);

        int c = 44;
        // A c értéke legyen dupla akkora
        c *= 2;
        System.out.println(c);

        int d = 125;
        //Oszd el a d-t 5-tel
        d /= 5;
        System.out.println(d);
        int e = 8;
        //Emeld köbre az e változó érétkét
        e *=  e*e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        //Logikai (boolean) értékétn írasd ki hogy f1 nagyobb f2-nél
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        System.out.println(g2*2 > g1);

        int h = 135798745;
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként
        System.out.println((h % 11) == 0);

        int i1 = 10;
        int i2 = 3;
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)

        System.out.println((i1 > i2*i2) && (i1 < i2*i2*i2));

        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        System.out.println((j%3 == 0) || (j%5 ==  0));
    }
}
