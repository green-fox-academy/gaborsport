public class DiagonalMatrix {
    public static void main(String[] args) {

        // - Készíts (dinamikusan*) egy kétdimenziós tömböt
//   a következő mátrix-szal**. Ciklust (loop-ot) használj!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Írasd ki a konzolra ezt a kétdimenziós tömböt
// * A tömb hossza egy változótól kell függjön
// ** Nyugalom, egy mátrix pont olyan, mint egy tömb

        int arrayLine = 4;
        int arrayRow = 4;
        int[][] numbers = new int[arrayLine][arrayRow];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j += arrayLine) {
                numbers[i][j] = 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j]);

            }
        }
    }
}
