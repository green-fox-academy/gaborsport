import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból és egy
    // ilyen négyzetet rajzol::
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // A négyzetnek annyi sora legyen,
    // mint amennyi az inputból kiolvasott szám értéke

        int numberLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Számot kérek:");
        numberLine = scanner.nextInt();
        for (int i = 1; i <= numberLine; i++) {
            for (int j = 0; j < numberLine; j++) {
                if (i == 1 || j == 1 || i == numberLine || j == numberLine) {
                    System.out.print("%");
                }
                else {
                    System.out.println(" ");
                }


            }

        }
        System.out.println();
    }
}
