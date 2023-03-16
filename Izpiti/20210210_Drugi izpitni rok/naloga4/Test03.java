
import java.util.*;

public class Test03 {

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
        seznam.add(new Cas(20, 6));
        seznam.add(new Cas(17, 47));
        System.out.println(Cetrta.razmnozi(seznam, 1));
    }
}
