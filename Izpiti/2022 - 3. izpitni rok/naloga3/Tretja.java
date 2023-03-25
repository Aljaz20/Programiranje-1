
import java.util.*;

public class Tretja {

    public static class Oddajnik {

        private  List<Sprejemnik> sprejemniki = new ArrayList<>();

        public void oddaj(char znak){
            for(Sprejemnik spr: sprejemniki){
                spr.sprejmi(znak);
            }
        }
        public  void sprejmi(Sprejemnik a){
            sprejemniki.add(a);
        }
    }

    public static class Sprejemnik {
        private Oddajnik odd;
        private int stevilo = 0;
        private List<Character> prejm = new ArrayList<>();
        private int k = 0;

        public Sprejemnik(Oddajnik odda){
            this.odd = odda;
            odda.sprejmi(this);

        }   

        public void sprejmi(char znak){
            prejm.add(znak);
            stevilo++;
        }
        public int koliko(){
            return stevilo;
        }

        public String odZadnjic(){
            String niz ="";
            for(int i = k; i < prejm.size(); i++){
                niz += prejm.get(i);
            }
            k = prejm.size();
            return niz;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
