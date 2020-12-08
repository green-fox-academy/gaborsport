public class ArraysUpload {
    public static void main(String[] args) {

        // tömb deklarálása és méretének megadása
        int[] tomb = new int[10];

// tömb feltöltése
        for( int i = 0; i < tomb.length; i++ )
        {
            tomb[i] = (int)(Math.random() * 100) + 1;
        }

// tömb elemeinek kiíratása
        for( int i = 0; i < tomb.length; i++ )
        {
            System.out.print(tomb[i] + " ");
        }
// extra sordobás
        System.out.println();
    }
}
