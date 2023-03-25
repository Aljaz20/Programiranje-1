
import java.util.*;

public class Test15 {

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
        seznam.add(new Cas(5, 10));
        seznam.add(new Cas(9, 58));
        seznam.add(new Cas(6, 23));
        seznam.add(new Cas(20, 30));
        seznam.add(new Cas(9, 50));
        seznam.add(new Cas(11, 58));
        seznam.add(new Cas(0, 46));
        seznam.add(new Cas(22, 46));
        seznam.add(new Cas(13, 27));
        seznam.add(new Cas(18, 5));
        seznam.add(new Cas(13, 44));
        seznam.add(new Cas(10, 14));
        System.out.println(Cetrta.razmnozi(seznam, 4));
    }
}
