
import java.util.*;

public class Test33 {

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
        seznam.add(new Cas(11, 6));
        seznam.add(new Cas(19, 20));

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<Cas> it = Cetrta.razmnozevalnik(seznam, 2);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i).plus(0, 6));
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
