public class BuildSquare {

    public static String generateSquare(int n) {

        String row = "+".repeat(n);
        String square = "";

        for (int i = 0; i < n; i++) {
            square += row;
            if (i < n - 1) {
                square += "\n";
            }
        }
        return square;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateSquare(n));
    }
}

/*
 * pseudo codice
 * -ciclare n. volte quanto il valore di n
 * -inserire un "+" in una stringa, quante volte il valore di n
 * -stampare la stringa quante volte il valore di n
 */