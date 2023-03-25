
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    //=========================================================================
    public static class Barva {
        private int r;
        private int g;
        private int b;

        public Barva(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d, %d)", this.r, this.g, this.b);
        }
    }

    //=========================================================================
    public static abstract class Lik {
        private Barva barva;

        protected Lik(Barva barva) {
            this.barva = barva;
        }

        public abstract String vrsta(); 
        public abstract String mere(); 
        public abstract int ploscina();
        public abstract int tip();

        @Override
        public String toString() {
            return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
        }

    }

    //=========================================================================
    public static class Pravokotnik extends Lik {
        private int a;
        private int b;

        public Pravokotnik(Barva barva, int a, int b) {
            super(barva);
            this.a = a;
            this.b = b;
        }

        public int vrniA() {
            return this.a;
        }

        @Override
        public String vrsta() {
            return "pravokotnik";
        }

        @Override
        public String mere() {
            return String.format("a = %d, b = %d", this.a, this.b);
        }

        @Override
        public int ploscina(){
            return this.a * this.b;
        }

        @Override
        public int tip(){
            return 1;
        }
    }

    //=========================================================================
    public static class Kvadrat extends Pravokotnik {
        public Kvadrat(Barva barva, int a) {
            super(barva, a, a);
        }

        @Override
        public String vrsta() {
            return "kvadrat";
        }

        @Override
        public String mere() {
            return String.format("a = %d", this.vrniA());
        }

        @Override
        public int ploscina(){
            return super.a * super.a;
        }

        @Override
        public int tip(){
            return 2;
        }
    }

    //=========================================================================
    public static class Krog extends Lik {
        private int r;

        public Krog(Barva barva, int r) {
            super(barva);
            this.r = r;
        }

        @Override
        public String vrsta() {
            return "krog";
        }

        @Override
        public String mere() {
            return String.format("r = %d", this.r);
        }

        @Override
        public int ploscina(){
            return (int)Math.round(Math.PI * this.r * this.r);
        }

        @Override
        public int tip(){
            return 3;
        }
    }

    //=========================================================================
    public static void urediNaravno(List<Lik> liki) {
        uredi(liki, Primerjalnikpoploscini1());
    }

    //=========================================================================
    public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) {
        List<Lik> novo = new ArrayList();
        for(Lik l: liki){
            novo.add(l);
        }
        uredi(novo, Primerjalnikpotipi1());

        return novo;
    }

    //=========================================================================

    public static <T> void uredi(List<Lik> liki, Comparator<Lik> primerjalnik) {
        int stElementov = liki.size();
        for (int i = 1;  i < stElementov;  i++) {
            Lik element = liki.get(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(liki.get(j), element) > 0) {
                liki.add(j + 1, liki.get(j));
                liki.remove(j+2);
                j--;
            }
            liki.add(j + 1, element);
            liki.remove(j+2);
        }
    }

    private static class Primerjalnikpoploscini implements Comparator<Lik> {
        @Override
        public int compare(Lik prva, Lik druga) {
            return prva.ploscina() - druga.ploscina();
        }
    }

    public static Comparator<Lik> Primerjalnikpoploscini1() {
        return new Primerjalnikpoploscini();
    }



    private static class Primerjalnikpotipi implements Comparator<Lik> {
        @Override
        public int compare(Lik prva, Lik druga) {
            if (prva.tip() == druga.tip()) {
                if(prva.barva.r == druga.barva.r){
                    if(prva.barva.g == druga.barva.g){
                        return prva.barva.b - druga.barva.b;
                    }
                    return prva.barva.g - druga.barva.g;
                }
                return prva.barva.r - druga.barva.r;
            }
            return prva.tip() - druga.tip();  
        }
    }

    public static Comparator<Lik> Primerjalnikpotipi1() {
        return new Primerjalnikpotipi();
    }

    public static <T> void uredi1(List<Lik> liki, Comparator<Lik> primerjalnik) {
        int stElementov = liki.size();
        for (int i = 1;  i < stElementov;  i++) {
            Lik element = liki.get(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(liki.get(j), element) > 0) {
                liki.add(j + 1, liki.get(j));
                liki.remove(j+2);
                j--;
            }
            liki.add(j + 1, element);
            liki.remove(j+2);
        }
    }
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
