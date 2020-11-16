public class SecondsInADay {
    public static void main(String[] args) {

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondremained = 60*60*24 - currentSeconds - (60*(currentMinutes+currentHours*60));
        System.out.println(secondremained);

    }
}
