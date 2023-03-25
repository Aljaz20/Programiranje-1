
import java.util.*;

public class Test27 {

    private static class Cas {
        int ura;
        int minuta;

        Cas(int ura, int minuta) {
            this.ura = ura;
            this.minuta = minuta;
        }

        @Override
        public String toString() {
            return String.format("%d:%02d", this.ura, this.minuta);
        }
    }

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>();
        seznam.add(new Cas(3, 46));
        seznam.add(new Cas(2, 0));
        seznam.add(new Cas(1, 4));
        seznam.add(new Cas(5, 16));
        seznam.add(new Cas(13, 7));
        seznam.add(new Cas(11, 49));
        seznam.add(new Cas(14, 5));
        seznam.add(new Cas(5, 46));
        seznam.add(new Cas(4, 59));
        seznam.add(new Cas(10, 28));
        seznam.add(new Cas(23, 1));
        seznam.add(new Cas(5, 29));
        seznam.add(new Cas(5, 29));
        seznam.add(new Cas(0, 44));
        seznam.add(new Cas(22, 30));
        seznam.add(new Cas(13, 12));
        seznam.add(new Cas(6, 58));
        seznam.add(new Cas(16, 17));
        seznam.add(new Cas(17, 49));
        seznam.add(new Cas(9, 26));
        seznam.add(new Cas(3, 36));
        seznam.add(new Cas(6, 1));
        seznam.add(new Cas(21, 53));
        seznam.add(new Cas(16, 48));
        seznam.add(new Cas(8, 38));
        seznam.add(new Cas(17, 36));
        seznam.add(new Cas(12, 29));
        seznam.add(new Cas(15, 6));
        seznam.add(new Cas(17, 48));
        seznam.add(new Cas(21, 50));
        seznam.add(new Cas(8, 27));
        seznam.add(new Cas(14, 53));
        seznam.add(new Cas(1, 23));
        seznam.add(new Cas(21, 28));
        seznam.add(new Cas(23, 12));
        seznam.add(new Cas(23, 52));
        seznam.add(new Cas(20, 2));
        seznam.add(new Cas(20, 46));
        seznam.add(new Cas(19, 28));
        seznam.add(new Cas(14, 56));
        seznam.add(new Cas(4, 7));
        seznam.add(new Cas(21, 59));
        System.out.println(Cetrta.razmnozi(seznam, 6));
    }
}
