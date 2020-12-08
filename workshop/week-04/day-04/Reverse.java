public class Reverse {
    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
// - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit

        int[] numbers = {4, 5, 6 ,7};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
            
        }
    }
}
