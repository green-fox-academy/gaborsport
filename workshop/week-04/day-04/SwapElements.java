public class SwapElements {
    public static void main(String[] args) {

        // - Készíts egy `orders` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["first", "second", "third"]`
// - Cseréld fel az első és a harmadik elemet az `orders` tömbben

        String[] orders = {"first", "second", "third"};

        String[] temp1 = {orders[0]};
        //String[] temp2 = new String[1];
        orders[0] = orders[2];
        orders[2] = temp1[0];
        for (String anything : orders) {
            System.out.println(anything);
        }

        //for (int i = 0; i < orders.length; i++) {
          //  System.out.println(orders[i]);
        //}






    }
}
