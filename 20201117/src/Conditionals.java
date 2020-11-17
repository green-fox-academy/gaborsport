public class Conditionals {
    public static void main(String[] args) {
        int a = 13;

        if (a == 13) {
            System.out.println("Yaaay! The value of the \"a\" variable is 13"); // Ez a block lefut
        }

        if (a == 8) {
            System.out.println("Yaaay! The value of the \"a\" variable is 8"); // Ez a block NEM fut le
        }


        int b = 20;

        if (b < 10) {
            System.out.println("Yaaay! The value of the \"b\" variable is lower than 10"); // Ez a block NEM fog lefutni
        } else {
            System.out.println("Yaaay! The value of the \"b\" variable is higher than 10"); // Ez a block lefut
        }


        int c = 15;

        if (c < 10) {
            System.out.println("Yaaay! The value of the \"c\" variable is lower than 10"); // Ez a block NEM fog lefutni
        } else if (c < 20) {
            System.out.println("Yaaay! The value of the \"c\" variable is higher than 10"); // Ez a block lefut
        } else {
            System.out.println("Yaaay! The value of the \"c\" variable is higher than 10"); // Ez a block NEM fog lefutni
        }


        boolean thirsty = true;
        boolean hungry = false;

        if (thirsty && hungry) {
            System.out.println("Ebéd idő!");
        } else if (thirsty || hungry) {
            System.out.println("Nasizzunk!");
        } else {
            System.out.println("Nincs kaja számodra.");
        }
    }
}