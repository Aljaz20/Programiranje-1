
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        public String toString(){
            String kraj = "";
            for(int i = 0; i < this.kraj.length; i++){
                kraj += String.valueOf(this.kraj[i]);
            }
            int prve = this.stevilo / 100;
            int druge = this.stevilo % 100;
            String a = kraj + " " + prve+"-"+druge;
            return a;
        }

        public Boolean equals(Tablica druga){
            String kraj = "";
            for(int i = 0; i < this.kraj.length; i++){
                kraj += String.valueOf(this.kraj[i]);
            }
            String kraj2 = "";
            for(int i = 0; i < druga.kraj.length; i++){
                kraj2 += String.valueOf(druga.kraj[i]);
            }
            if(kraj.equals(kraj2) && this.stevilo == druga.stevilo && this.zacasna == druga.zacasna){
                return true;
            }
            return false;
        }
        @Override
        public int hashCode(){
            int vrednost = 0;
            if(this.zacasna){
                vrednost = 1;
            }else{
                vrednost = 2;
            }
            int kraj = 0;
            for(int i = 0; i < this.kraj.length; i++){
                kraj = 100*kraj + Character.valueOf(this.kraj[i]);
            }
            int a = vrednost + this.stevilo*10 + kraj*10000;
            return a;
        }
    }
}
