
public class Test47 {

    public static void main(String[] args) {
        int[][] t = {
            { 4, 7, 1, 9, 5, 5, 7, 1, 6, 6, 5, 9, 5 },
            { 2, 5, 9, 1, 4, 2, 7, 6, 6, 2, 8, 2, 7 },
            { 9, 7, 6, 1, 7, 7, 4, 2, 6, 3, 8, 7, 6 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 3;  i++) {
            for (int j = 0;  j < 13;  j++) {
                System.out.printf("%3d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
