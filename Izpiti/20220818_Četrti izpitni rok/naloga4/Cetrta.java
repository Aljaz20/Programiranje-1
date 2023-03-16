
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01..03: kli"cejo samo metodo /vecji/
 * 04..06: kli"cejo samo metodo /vecjiPrim/
 * 07..10: kli"cejo samo metodo /primerjalnik/
 *
 * Skriti testni primeri:
 * 01..16: kli"cejo samo metodo /vecji/
 * 17..33: kli"cejo samo metodo /vecjiPrim/
 * 34..50: kli"cejo samo metodo /primerjalnik/
 *
 * V testnih primerih, ki kli"cejo metodo /primerjalnik/, za vsak par kazalcev
 * a in b velja (a.equals(b) ==> a == b).  Z drugimi besedami: nikoli ne
 * izdelamo dveh enakih objektov, npr. Cas a = new Cas(10, 35) in 
 * Cas b = new Cas(10, 35).
 */


import java.util.*;

public class Cetrta {

    public static Set<Integer> vecji(Map<Integer, Integer> slovar) {
        Set<Integer> novi = new HashSet<>();
        for(Integer inta: slovar.keySet()){
            if(inta > slovar.get(inta)){
                novi.add(inta);
            }
        }
        return novi;
    }

    public static <T> Set<T> vecjiPrim(Map<T, T> slovar, Comparator<T> prim) {
        Set<T> novi = new HashSet<>();
        for(T inta: slovar.keySet()){
            if(prim.compare(inta, slovar.get(inta)) > 0){
                novi.add(inta);
            }
        }
        return novi;
    }

    public static <T> Comparator<T> primerjalnik(Map<T, T> slovar, Set<T> mnozica) {
        return new Primerjalnik1(slovar, mnozica);
    }

    private static class  Primerjalnik1<T> implements Comparator<T> {
        private Map<T, T> slovar;
        private Set<T> mnozica;

        public Primerjalnik1(Map<T, T> slovar, Set<T> mnozica){
            this.slovar = slovar;
            this.mnozica = mnozica;
        }
        @Override
        public int compare(T prva, T druga) {
            Set<T> seznam = new HashSet<>();
            seznam = this.slovar.keySet();
            if (seznam.contains(prva)) {
                if(slovar.get(prva).equals(druga)){
                    if(mnozica.contains(prva)){
                        return 1;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
