
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Opravilo {
        private String naziv;
        private int zahtevnost;

        public Opravilo(String naziv, int zahtevnost) {
            this.naziv = naziv;
            this.zahtevnost = zahtevnost;
        }
    }

    //=========================================================================
    public static class Projekt {
        private String naziv;
        private Opravilo[] opravila;

        public Projekt(String naziv, Opravilo[] opravila) {
            this.naziv = naziv;
            this.opravila = opravila;
        }

        public int zahtevnost() {
            int zaht = 0;
            for(Opravilo opr: opravila){
                if(opr.zahtevnost > zaht){
                    zaht = opr.zahtevnost;
                }
            }
            return zaht;
        }

        public boolean jePermutacijaOd(Object drugi) {
            if(drugi instanceof Projekt){
                Projekt dr = (Projekt) drugi;
                if(dr.opravila.length == this.opravila.length){
                    for(Opravilo opr1: dr.opravila){
                        boolean da = false;
                        for(Opravilo opr2: this.opravila){
                            if(opr1.equals(opr2)){
                                da = true;
                                break;
                            }
                        }
                        if(da){
                            continue;
                        }else{
                            return false;
                        }
                    }
                    return true;
                }
                
            }
            return false;
        }
    }

    //=========================================================================
    public static class Delavec {
        private String ip;
        private int usposobljenost;

        public Delavec(String ip, int usposobljenost) {
            this.ip = ip;
            this.usposobljenost = usposobljenost;
        }
    }

    //=========================================================================
    public static class Delavnica {
        private Delavec[] delavci;

        public Delavnica(Delavec[] delavci) {
            this.delavci = delavci;
        }

        public int univerzalci(Projekt[] projekti) {
            int delav = 0;
            int zahtev = 0;
            for(Projekt pr: projekti){
                if(pr.zahtevnost() > zahtev){
                    zahtev = pr.zahtevnost();
                }
            }
            for(Delavec del: this.delavci){
                if(del.usposobljenost >= zahtev){
                    delav++;
                }
            }
            return delav;
        }
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
