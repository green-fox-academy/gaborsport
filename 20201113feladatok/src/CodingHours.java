public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        int nap = 6;  // 6 óra/nap
        System.out.println("Egy átlagos Green Fox hallgató 6 órát kódol naponta.");

        // Egy félév hosszúsága 17 hét
        int félév = 17;
        System.out.println("Egy félév hosszúsága 17 hét");

        // ha a hallgató csak hétköznap kódol
        int hétköznap = 5;
        System.out.println("ha a hallgató csak hétköznap kódol");

        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        int összesÓrák;
        összesÓrák = nap * félév * hétköznap;

        System.out.println("Egy hallgató " + összesÓrák + " órát tölt kódolással egy félév során");

        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        System.out.println("az átlagos heti munkaidő 52 óra");
        double hetiMunkaidő = 52;
        double hánySzázalék;
        hánySzázalék = nap * hétköznap/hetiMunkaidő * 100;
        System.out.println("a félév " + hánySzázalék +  " %-át tölti kódolással a hallgató");






    }
}
