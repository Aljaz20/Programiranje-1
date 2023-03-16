
import java.util.*;

public abstract class Lik implements Comparable<Lik> {

    public abstract int ploscina();

    public abstract int obseg();

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    // Vrne vrsto lika <this> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this> 
    // (npr. "sirina = 3.0, visina = 4.0").
    public abstract String podatki();

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }

    // Implementacija metode compareTo iz vmesnika Comparable<Lik>, ki ga
    // implementira razred Lik
    @Override
    public int compareTo(Lik drugi) {
        return this.ploscina() - drugi.ploscina();
    }

    // Vrne objekt tipa Comparator<Lik>, ki primerja podana lika po obsegu.
    public static Comparator<Lik> poObsegu() {
        return new PrimerjalnikPoObsegu();
    }

    private static class PrimerjalnikPoObsegu implements Comparator<Lik> {
        @Override
        public int compare(Lik a, Lik b) {
            return a.obseg() - b.obseg();
        }
    }

    // Vrne objekt tipa Comparator<Lik>, ki primerja podana lika po tipu.
    public static Comparator<Lik> poTipu() {
        return new PrimerjalnikPoTipu();
    }

    private static class PrimerjalnikPoTipu implements Comparator<Lik> {
        @Override
        public int compare(Lik a, Lik b) {
            return a.tip() - b.tip();
        }
    }

    // Vrne zaporedno številko tipa objekta <this>.  Zaporedna številka tipa
    // Pravokotnik mora biti manjša od zaporedne številke tipa Kvadrat, ta pa
    // mora biti manjša od zaporedne številke tipa Krog.  Le na ta način lahko
    // namreč zagotovimo, da bo primerjalnik, ki ga vrne metoda poTipu,
    // pravilno razvrstil like glede na njihove tipe.
    public abstract int tip();

    // Uredi like v podanem vektorju primarno po tipu, sekundarno pa po
    // obsegu.
    public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
        Skupno.uredi(vektor, Skupno.kompozitum(poTipu(), poObsegu()));
    }
}
