
public class Test35 {

    public static void main(String[] args) {
        int[][] t = {
            { 456,  59, 134, 775 },
            { 614, 290, 877, 215 },
            { 972, 623, 137, 213 },
            { 882, 523, 328, 621 },
            {  69, 442,  64,   8 },
            { 480, 942, 545, 895 },
            { 656, 745, 230, 479 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 7;  i++) {
            for (int j = 0;  j < 4;  j++) {
                System.out.printf("%5d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
