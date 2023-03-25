
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] najditel = new String[this.vrniNajdbe().length];
            for(int i = 0; i < najditel.length; i++){
                najditel[i] = this.vrniNajdbe()[i].najditelj;
            }
            return najditel;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double pot = 0.0;
            Tocka temp = zacetna;
            for(int i = 0; i < this.zakladi.length; i++){
                pot += Math.sqrt(Math.pow(zacetna.x - zakladi[i].polozaj.x, 2) + Math.pow(zacetna.y - zakladi[i].polozaj.y, 2));
                zacetna = zakladi[i].polozaj;
            }
            pot += Math.sqrt(Math.pow(zacetna.x - temp.x, 2) + Math.pow(zacetna.y - temp.y, 2));
            return pot;
        }

        public Zaklad nazadnjeOdkrit() {
            int max = 0;
            Zaklad zadnji = null;
            for(int i = 0; i < this.zakladi.length; i++){
                if(this.zakladi[i].najdbe.length != 0){
                    if(this.zakladi[i].najdbe[0].cas > max){
                        max = this.zakladi[i].najdbe[0].cas;
                        zadnji = this.zakladi[i];
                    }
                }
            }
            return zadnji;
            
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
