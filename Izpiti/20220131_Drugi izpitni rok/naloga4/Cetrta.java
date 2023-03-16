
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }
        public int vrnix(){
            return this.x;
        }
        public int vrniy(){
            return this.y;
        }
        public double razdaljasredisce(){
            return Math.round(10000.0*Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)))/10000.0;
        }

        public double polarnikot(){
            double kot = Math.atan((1.0 * this.y) / this.x);
            if((this.x <= 0 && this.y < 0) ||(this.x < 0 && this.y >= 0)){
                kot = kot + Math.PI;
            }else if(this.x >= 0 && this.y < 0){
                kot = kot + 2*Math.PI;
            }
            return kot;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke) {
            Map<Boolean, List<Tocka>> novi = new HashMap<>();
            List<Tocka> x = new ArrayList<>();
            List<Tocka> y = new ArrayList<>();
            for(Tocka t: tocke){
                if(t.vrnix() > this.x){
                    x.add(t);
                }else{
                    y.add(t);
                }
            }
            novi.put(true, x);
            novi.put(false, y);
            return novi;
        }

        public static Comparator<Tocka> polarno() {
            return new Primerjalnik();
        }

        private static class Primerjalnik implements Comparator<Tocka>{
            @Override
            public int compare(Tocka prva, Tocka druga) {

                double razdalja = prva.razdaljasredisce() - druga.razdaljasredisce();
                int razd1 = 0;
                if(razdalja < 0){
                    razd1 = -1;
                }else{
                    razd1 = 1;
                }
                double kot = prva.polarnikot() - druga.polarnikot();
                int k1 = 0;
                if(kot < 0){
                    k1 = -1;
                }else{
                    k1 = 1;
                }

                if (prva.razdaljasredisce() == druga.razdaljasredisce()) {
                    return k1; 
                }
                return razd1;
            }
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
