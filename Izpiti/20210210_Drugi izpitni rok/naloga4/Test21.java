
import java.util.*;

public class Test21 {

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
        seznam.add(new Cas(6, 55));
        seznam.add(new Cas(4, 2));
        seznam.add(new Cas(15, 46));
        seznam.add(new Cas(17, 5));
        seznam.add(new Cas(10, 20));
        seznam.add(new Cas(11, 38));
        seznam.add(new Cas(4, 28));
        seznam.add(new Cas(9, 45));
        seznam.add(new Cas(21, 36));
        seznam.add(new Cas(11, 24));
        seznam.add(new Cas(15, 21));
        seznam.add(new Cas(9, 16));
        System.out.println(Cetrta.razmnozi(seznam, 12));
    }
}
