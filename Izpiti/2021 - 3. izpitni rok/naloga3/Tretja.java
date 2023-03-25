
import java.util.*;

public class Tretja {

    public static abstract class Zival {
        public abstract String oglasiSe();
    }

    public static class Pes extends Zival {
        @Override
        public String oglasiSe(){
            return "hov";
        }
    }

    public static class Macka extends Zival {
        @Override
        public String oglasiSe(){
            return "mijav";
        }
    }

    public static class RodovniskiPes extends Pes {
        private String pasma;
        private RodovniskiPes oce;
        private RodovniskiPes mati;

        public RodovniskiPes(String pasma, RodovniskiPes oce, RodovniskiPes mati) {
            this.pasma = pasma;
            this.oce = oce;
            this.mati = mati;
        }

        public boolean preveri() {
            if(this.mati == null && this.oce == null){
                return true;
            }else if(this.mati.pasma.equals(this.oce.pasma) && this.mati.pasma.equals(this.pasma)){
                return this.oce.preveri() && this.mati.preveri();
            }else{
                return false;
            }
        }

        // po potrebi dopolnite ...
    }

    public static int prestej(RodovniskiPes[] psi, String pasma) {
        int st = 0;
        for(RodovniskiPes rp: psi){
            if(rp.pasma.equals(pasma)){
                st++;
            }
        }
        return st;
    }
}
