
import java.util.*;

public class Test48 {

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

        public Cas plus(int h, int min) {
            int m = (((this.ura + h) * 60 + (this.minuta + min)) % 1440 + 1440) % 1440;
            return new Cas(m / 60, m % 60);
        }
    }

    public static void main(String[] args) {
        List<Cas> seznam = new ArrayList<>();
        seznam.add(new Cas(12, 7));
        seznam.add(new Cas(15, 1));
        seznam.add(new Cas(2, 46));
        seznam.add(new Cas(5, 23));
        seznam.add(new Cas(21, 5));
        seznam.add(new Cas(18, 46));
        seznam.add(new Cas(18, 31));
        seznam.add(new Cas(0, 29));
        seznam.add(new Cas(21, 17));
        seznam.add(new Cas(4, 37));
        seznam.add(new Cas(21, 1));
        seznam.add(new Cas(19, 50));
        seznam.add(new Cas(11, 20));
        seznam.add(new Cas(17, 7));
        seznam.add(new Cas(22, 20));
        seznam.add(new Cas(1, 24));
        seznam.add(new Cas(19, 10));
        seznam.add(new Cas(19, 37));
        seznam.add(new Cas(17, 2));
        seznam.add(new Cas(5, 39));
        seznam.add(new Cas(6, 39));
        seznam.add(new Cas(23, 3));
        seznam.add(new Cas(7, 55));
        seznam.add(new Cas(9, 44));
        seznam.add(new Cas(10, 26));
        seznam.add(new Cas(2, 32));
        seznam.add(new Cas(5, 10));
        seznam.add(new Cas(22, 14));
        seznam.add(new Cas(7, 29));
        seznam.add(new Cas(14, 58));
        seznam.add(new Cas(18, 49));
        seznam.add(new Cas(0, 12));
        seznam.add(new Cas(9, 16));
        seznam.add(new Cas(19, 38));
        seznam.add(new Cas(0, 59));
        seznam.add(new Cas(23, 15));
        seznam.add(new Cas(18, 56));
        seznam.add(new Cas(8, 41));
        seznam.add(new Cas(14, 14));
        seznam.add(new Cas(9, 44));
        seznam.add(new Cas(10, 13));
        seznam.add(new Cas(7, 26));

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Cas> it = Cetrta.razmnozevalnik(seznam, 3);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i).plus(18, 21));
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
