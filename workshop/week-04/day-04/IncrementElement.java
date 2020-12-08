public class IncrementElement {
    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3, 4, 5]`
// - Növeld a harmadik elem értékét (pl.: eggyel)
// - Írasd ki a konzolra a `numbers` nevű tömb harmadik elemét

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]);
        numbers[2] +=1;
        System.out.println(numbers[2]);
        System.out.println(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
