
import java.util.*;

public class Test30 {

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
        seznam.add(new Cas(17, 29));
        seznam.add(new Cas(12, 52));
        seznam.add(new Cas(15, 33));
        seznam.add(new Cas(8, 36));
        seznam.add(new Cas(13, 34));
        seznam.add(new Cas(18, 36));
        seznam.add(new Cas(15, 33));
        seznam.add(new Cas(11, 3));
        seznam.add(new Cas(3, 54));
        seznam.add(new Cas(8, 0));
        seznam.add(new Cas(18, 34));
        seznam.add(new Cas(3, 46));
        seznam.add(new Cas(2, 6));
        seznam.add(new Cas(6, 4));
        seznam.add(new Cas(17, 25));
        seznam.add(new Cas(8, 46));
        seznam.add(new Cas(15, 16));
        seznam.add(new Cas(2, 46));
        seznam.add(new Cas(11, 52));
        seznam.add(new Cas(3, 33));
        seznam.add(new Cas(0, 51));
        seznam.add(new Cas(15, 58));
        seznam.add(new Cas(20, 41));
        seznam.add(new Cas(1, 7));
        seznam.add(new Cas(10, 12));
        seznam.add(new Cas(1, 15));
        seznam.add(new Cas(0, 51));
        seznam.add(new Cas(11, 49));
        seznam.add(new Cas(8, 54));
        seznam.add(new Cas(16, 44));
        seznam.add(new Cas(11, 5));
        seznam.add(new Cas(0, 17));
        seznam.add(new Cas(8, 3));
        seznam.add(new Cas(5, 45));
        seznam.add(new Cas(14, 10));
        seznam.add(new Cas(20, 8));
        seznam.add(new Cas(7, 54));
        seznam.add(new Cas(3, 25));
        seznam.add(new Cas(12, 23));
        seznam.add(new Cas(21, 3));
        seznam.add(new Cas(4, 57));
        seznam.add(new Cas(7, 11));
        System.out.println(Cetrta.razmnozi(seznam, 9));
    }
}
