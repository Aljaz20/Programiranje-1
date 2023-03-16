
public class Test38 {

    public static void main(String[] args) {
        int[][] t = {
            { 791, 986,  12, 353 },
            { 426, 303, 795,   8 },
            {  26, 595, 363, 975 },
            { 861, 250, 505, 657 },
            { 977, 348, 972, 763 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 5;  i++) {
            for (int j = 0;  j < 4;  j++) {
                System.out.printf("%5d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
