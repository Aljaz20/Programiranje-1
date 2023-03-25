
import java.util.*;

public class Test18 {

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
        seznam.add(new Cas(4, 19));
        seznam.add(new Cas(7, 52));
        seznam.add(new Cas(18, 47));
        seznam.add(new Cas(23, 51));
        seznam.add(new Cas(23, 33));
        seznam.add(new Cas(7, 16));
        seznam.add(new Cas(16, 47));
        seznam.add(new Cas(4, 40));
        seznam.add(new Cas(10, 48));
        seznam.add(new Cas(16, 18));
        seznam.add(new Cas(5, 10));
        seznam.add(new Cas(23, 3));
        System.out.println(Cetrta.razmnozi(seznam, 8));
    }
}
