
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        @Override
        public String toString() {
            return this.ip;
        }

        public int placaNadrejenega() {
            if(this.nadrejeni == null){
                return -1;
            }else {
                return this.nadrejeni.placavrni();
            }
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
            int stevillo = 0;
            for(Zaposleni za: zaposleni){
                for(Zaposleni za1: zaposleni){
                    if(za instanceof Delavec && za1 instanceof Vodja){
                        if(za.placa > za1.placa){
                            stevillo++;
                        }
                    }else if (za1 instanceof Delavec && za instanceof Vodja){
                        if(za1.placa > za.placa){
                            stevillo++;
                        }
                    }
                }
            }
            return stevillo/2;
        }
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
        public int placavrni(){
            return super.placa;
        }

        public Vodja vrhovni() {
            if(super.nadrejeni == null){
                return this;
            }else{
                return super.nadrejeni.vrhovni();
            }
        }
    }
}
