
public class Test43 {

    public static void main(String[] args) {
        int[][] t = {
            { 37, 86 },
            { 83, 50 },
            {  6, 71 },
            { 31, 86 },
            { 52,  8 },
            { 68, 36 },
            { 44, 99 },
            { 48,  4 },
            { 20, 18 },
            { 26, 68 },
            { 20,  8 },
            { 14, 26 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 12;  i++) {
            for (int j = 0;  j < 2;  j++) {
                System.out.printf("%4d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
