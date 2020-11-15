import java.util.Arrays;

public class Három {
    public static void main(String[] args) {
        System.out.println();

      /*  int i = 50;
        i = 60;
        System.out.println(i);
        // tömb létrehozása
        int[] numbers;  //deklaráltam, hogy lesz egy numbers nevű változóm
        numbers = new int[10];
        /* konkrétan létrehozok egy 10 elemű tömböt.
        Az egyenlőséggel hpzzárendelem a numbers nevű változóhoz.
        System.out.println(numbers[6]);

        numbers[0] = 4;
        numbers[1] = 12;
        numbers[2] = 7;
        numbers[3] =-6;
        numbers[4] = 53;
        numbers[5] = 42;
        numbers[6] = 31;
        numbers[7] = 0;
        numbers[8] = -100;
        numbers[9] = 72;  // elemek beírása tömbbe

        // tömb elemeinek lekérdezése
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));
        */



        // többdimenziós tömbök
        // létrehozás
        int[][] numbers = new int[4][];
        int[] data1 = new int[4];
        int[] data2 = new int[7];
        int[] data3 = new int[25];
        int[] data4 = new int[2];
        numbers[0] = data1;
        numbers[1] = data2;
        numbers[2] = data3;
        numbers[3] = data4;


        // elemek tárolása tömbben
        numbers[1][2] =42;
        System.out.println(numbers[1][2]);


        //referencia típusú tömbök
       // Srings[] names = new Srings[4];
        // csak a referencia tárolódik, egy mutató, ami átmutat egy memóriaterületre, ahol található


       // Sring[][] names = {{"John", "Aaron", "Valerian", "Antony"},{"Ronald", "Xardas"}};
      //  System.out.println(names[1][1]);



    }
}
