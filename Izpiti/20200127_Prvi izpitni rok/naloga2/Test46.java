
public class Test46 {

    public static void main(String[] args) {
        int[][] t = {
            { 514, 651, 581, 289, 646, 421, 991, 489, 310, 209, 243 },
            { 219, 164, 822, 287, 354, 930, 625, 607, 353, 216, 995 },
            { 476, 609, 899, 454, 131, 464, 613, 978, 256, 511, 288 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 3;  i++) {
            for (int j = 0;  j < 11;  j++) {
                System.out.printf("%5d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
