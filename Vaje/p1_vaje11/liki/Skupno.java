
import java.util.*;

public class Skupno {

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> Comparator<T> kompozitum(Comparator<T> prvi, Comparator<T> drugi) {
        // objektu tipa Kompozitum moramo posredovati oba primerjalnika, saj
        // ju bomo potrebovali v njegovi metodi compare
        return new Kompozitum<T>(prvi, drugi);
    }

    private static class Kompozitum<T> implements Comparator<T> {
        private Comparator<T> prvi;
        private Comparator<T> drugi;

        public Kompozitum(Comparator<T> prvi, Comparator<T> drugi) {
            this.prvi = prvi;
            this.drugi = drugi;
        }

        @Override
        public int compare(T a, T b) {
            // Objekta a in b primerjamo s prvim primerjalnikom in vrnemo
            // rezultat primerjave, če je ta različen od 0.  Če je rezultat
            // enak 0, primerjamo objekta še z drugim primerjalnikom in vrnemo
            // rezultat primerjave.
            int prim = this.prvi.compare(a, b);
            return (prim == 0) ? (this.drugi.compare(a, b)) : (prim);
        }
    }
}
