public class Loops {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            System.out.println(a); //Terminálban található: a számok 0-tól 9-ig
            a = a + 1;
        }
        System.out.println(" ");

        for (int i = 0; i < 100; i++) {
            System.out.println(i); // Terminálban látható: a számok 0-tól 99-ig
        }
    }
}

