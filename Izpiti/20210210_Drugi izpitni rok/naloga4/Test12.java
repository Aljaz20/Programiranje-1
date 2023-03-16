
import java.util.*;

public class Test12 {

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
        seznam.add(new Cas(2, 57));
        seznam.add(new Cas(9, 8));
        seznam.add(new Cas(10, 16));
        seznam.add(new Cas(17, 8));
        seznam.add(new Cas(9, 21));
        seznam.add(new Cas(14, 46));
        seznam.add(new Cas(11, 15));
        seznam.add(new Cas(1, 5));
        seznam.add(new Cas(23, 10));
        seznam.add(new Cas(17, 57));
        seznam.add(new Cas(7, 40));
        seznam.add(new Cas(5, 58));
        System.out.println(Cetrta.razmnozi(seznam, 1));
    }
}
