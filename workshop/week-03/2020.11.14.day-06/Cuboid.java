public class Cuboid {
    public static void main(String[] args) {

        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000

        double legth =10;
        double width =10;
        double height =10;
         double Surface = 2*(width*height + height*legth + width*legth);
         double Volume = width*height*legth;



        System.out.println("Felület: " + (int)Surface );
        System.out.println("Térfogat: " + (int)Volume);

    }
}
