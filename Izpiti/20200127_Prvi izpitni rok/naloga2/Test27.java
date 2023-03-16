
public class Test27 {

    public static void main(String[] args) {
        int[][] t = {
            { 53, 23, 40, 46, 47, 50, 64, 16, 38, 47, 31 },
            { 42, 77, 56, 27, 55, 66,  1, 97, 80, 21, 95 },
            { 15, 90, 29, 48, 53, 12, 56, 20, 22, 27, 40 },
            { 73, 15, 91, 46, 82, 53, 61,  3, 13, 95, 19 },
            { 91, 27, 98, 41, 11, 88, 80, 74, 31,  8,  8 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 5;  i++) {
            for (int j = 0;  j < 11;  j++) {
                System.out.printf("%4d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
