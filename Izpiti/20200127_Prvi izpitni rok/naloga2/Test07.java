
public class Test07 {

    public static void main(String[] args) {
        int[][] t = {
            { 422, 256, 850, 106, 986, 855,  42 },
            { 465, 604, 102, 687, 960, 762, 747 },
        };

        for (int krog = 0;  krog < 7;  krog++) {
            System.out.println(Druga.najCas(t, krog));
        }
    }
}
