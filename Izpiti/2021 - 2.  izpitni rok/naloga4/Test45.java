
import java.util.*;

public class Test45 {

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
        seznam.add(new Cas(12, 39));
        seznam.add(new Cas(0, 21));
        seznam.add(new Cas(8, 55));
        seznam.add(new Cas(17, 41));
        seznam.add(new Cas(9, 38));
        seznam.add(new Cas(11, 51));
        seznam.add(new Cas(3, 36));
        seznam.add(new Cas(21, 48));
        seznam.add(new Cas(3, 32));
        seznam.add(new Cas(16, 26));
        seznam.add(new Cas(4, 50));
        seznam.add(new Cas(8, 22));
        seznam.add(new Cas(12, 32));
        seznam.add(new Cas(8, 51));
        seznam.add(new Cas(5, 56));
        seznam.add(new Cas(8, 40));
        seznam.add(new Cas(0, 16));
        seznam.add(new Cas(2, 49));
        seznam.add(new Cas(9, 25));
        seznam.add(new Cas(18, 25));

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Cas> it = Cetrta.razmnozevalnik(seznam, 7);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i).plus(20, 36));
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
