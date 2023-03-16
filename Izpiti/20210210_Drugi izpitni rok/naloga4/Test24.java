
import java.util.*;

public class Test24 {

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
        seznam.add(new Cas(16, 18));
        seznam.add(new Cas(6, 43));
        seznam.add(new Cas(13, 9));
        seznam.add(new Cas(6, 3));
        seznam.add(new Cas(5, 56));
        seznam.add(new Cas(16, 32));
        seznam.add(new Cas(21, 37));
        seznam.add(new Cas(3, 16));
        seznam.add(new Cas(19, 43));
        seznam.add(new Cas(7, 45));
        seznam.add(new Cas(13, 43));
        seznam.add(new Cas(5, 56));
        seznam.add(new Cas(4, 24));
        seznam.add(new Cas(18, 10));
        seznam.add(new Cas(8, 11));
        seznam.add(new Cas(8, 47));
        seznam.add(new Cas(6, 2));
        seznam.add(new Cas(10, 7));
        seznam.add(new Cas(13, 6));
        seznam.add(new Cas(16, 1));
        seznam.add(new Cas(12, 7));
        System.out.println(Cetrta.razmnozi(seznam, 7));
    }
}
