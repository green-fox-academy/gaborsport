public class CompareLength {
    public static void main(String[] args) {

        // - Készíts egy `firstArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3]`
// - Készíts egy `secondArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5]`
// - Írasd ki a konzolra, hogy "A secondArrayOfNumbers hosszabb", ha
//   `secondArrayOfNumbers` több elemet tartalmaz, mint az `firstArrayOfNumbers`

        int[] firstArrayNumbers = {1, 2, 3};
        int[] secondArrayNumbers = {4, 5};
        if (secondArrayNumbers.length > firstArrayNumbers.length) {
            System.out.println("A secondArrayOfNumbers hosszabb");
        }

        else if (secondArrayNumbers.length < firstArrayNumbers.length) {
            System.out.println("Az első tömb hosszabb");
        }


    }
}
