
import java.util.*;

public class Test42 {

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
        seznam.add(new Cas(20, 24));
        seznam.add(new Cas(15, 11));
        seznam.add(new Cas(5, 40));
        seznam.add(new Cas(10, 4));
        seznam.add(new Cas(23, 18));
        seznam.add(new Cas(1, 11));
        seznam.add(new Cas(13, 38));
        seznam.add(new Cas(7, 47));
        seznam.add(new Cas(5, 46));
        seznam.add(new Cas(16, 1));
        seznam.add(new Cas(22, 8));
        seznam.add(new Cas(8, 41));

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Cas> it = Cetrta.razmnozevalnik(seznam, 11);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i).plus(6, 15));
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
