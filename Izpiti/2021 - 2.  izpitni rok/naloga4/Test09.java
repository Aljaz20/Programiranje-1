
import java.util.*;

public class Test09 {

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
        seznam.add(new Cas(4, 51));
        seznam.add(new Cas(17, 1));
        seznam.add(new Cas(12, 59));
        seznam.add(new Cas(22, 34));
        System.out.println(Cetrta.razmnozi(seznam, 2));
    }
}
