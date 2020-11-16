public class Tombok
{
    public static void main(String[] args)
    {
        // tömbök - arrays
        int[] tomb1 = new int[10];
        //                       0,1,2,3,4,5,6,7,8, 9
        int[] tomb2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        tomb2[0] = 20;

        for (int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = i;
            System.out.print(tomb1[i] + " ");
        }
        System.out.println("");

           String[] nevek = new String[] {"Bozsi", "juci", "Evi", "Virag", "Dori"};

           nevek[4] = "Eniko";

            for (int i = 0; i < nevek.length; i++)
            {

                System.out.print(nevek[i] + " ");
            }
    }

    {
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
