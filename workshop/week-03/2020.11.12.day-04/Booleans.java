public class Booleans {
    public static void main(String[] args) {
        // igaz, hamis
        System.out.println(true); // Terminálban látható: true (=igaz)
        System.out.println(false); // Terminálban látható: false (=hamis)

        // "Logikai és" (and) művelet
        System.out.println(true && true); // Terminálban látható: true
        System.out.println(true && false); // Terminálban látható: false
        System.out.println(false && true); // Terminálban látható: false
        System.out.println(false && false);  // Terminálban látható: false

        // "Logikai vagy" (or) művelet

        System.out.println(true || true); // Terminálban látható: true
        System.out.println(true || false); // Terminálban látható: true
        System.out.println(false || true); // Terminálban látható: true
        System.out.println(false || false); // Terminálban látható: true
    }
}
