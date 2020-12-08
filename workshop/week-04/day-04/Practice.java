public class Practice {
    public static void main(String[] args) {
        String[] number = {"one", "two", "three"};
        getNumbers(number);
        String second = "";
        getTwo(number);
        System.out.println(getTwo(number));
    }

    private static String getTwo(String[] number) {
        String second = "";
        for (int i = 0; i < number.length; i++) {
            if (number[i].equals("two")) {
                second = number[i];
                break;
            } else {
                second = "Nem nyert";
            }
        }
        return second;
    }

    private static void getNumbers(String[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }
    }
}
