
public class Test45 {

    public static void main(String[] args) {
        int[][] t = {
            { 2, 7, 4, 9, 5, 7, 3 },
            { 8, 7, 9, 6, 7, 5, 1 },
            { 8, 9, 1, 1, 5, 6, 2 },
            { 9, 5, 7, 2, 5, 6, 3 },
            { 2, 1, 6, 6, 6, 1, 7 },
            { 9, 7, 5, 1, 3, 1, 9 },
            { 3, 2, 3, 3, 6, 6, 7 },
            { 4, 4, 3, 3, 8, 1, 6 },
            { 9, 3, 9, 6, 3, 6, 8 },
            { 7, 5, 3, 9, 6, 8, 7 },
            { 1, 6, 9, 4, 7, 4, 3 },
            { 4, 6, 1, 3, 1, 8, 5 },
            { 2, 9, 3, 6, 1, 7, 8 },
            { 3, 1, 7, 7, 4, 4, 9 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 14;  i++) {
            for (int j = 0;  j < 7;  j++) {
                System.out.printf("%3d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
