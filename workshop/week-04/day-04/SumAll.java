public class SumAll {
    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét

        int[] numbers = {3, 4, 5, 6, 7};
        System.out.println(getSumAll(numbers));

    }

    static int getSumAll(int[] numbers) {
        int sumAll = 0;
        for (int number : numbers) {
            //sumAll = sumAll + numbers[i];
            sumAll += number;
        }
        return sumAll;
    }
}
