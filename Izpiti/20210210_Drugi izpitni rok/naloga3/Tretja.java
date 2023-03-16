
/*
 * tj.exe
 */

/*
 * Razli"cni objekti tipa Oseba, Cilj oz. Nocitev predstavljajo razli"cne
 * osebe, cilje oz. no"citve.
 *
 * Distinct objects of classes Oseba, Cilj, and Nocitev represent distinct
 * persons, destinations, and overnight stays.
 */

import java.util.*;

public class Tretja {

    //=========================================================================
    public static class Oseba {
        private String ip;
        private String drzava;

        public Oseba(String ip, String drzava) {
            this.ip = ip;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Cilj {
        private String kraj;
        private String drzava;

        public Cilj(String kraj, String drzava) {
            this.kraj = kraj;
            this.drzava = drzava;
        }
    }

    //=========================================================================
    public static class Nocitev {
        private Oseba oseba;
        private Cilj cilj;
        private int leto;

        public Nocitev(Oseba oseba, Cilj cilj, int leto) {
            this.oseba = oseba;
            this.cilj = cilj;
            this.leto = leto;
        }
    }

    //=========================================================================
    public static int notranje(Nocitev[] nocitve) {
        int noc = 0;
        for(Nocitev noci: nocitve){
            if(noci.cilj.drzava.equals(noci.oseba.drzava)){
                noc++;
            }
        }
        return noc;
    }

    //=========================================================================
    public static boolean jeZvesta(Nocitev[] nocitve, Oseba oseba) {
        boolean prvicv = true;
        Cilj c = null;
        for(Nocitev noci: nocitve){
            if(noci.oseba.equals(oseba) && prvicv){
                c = noci.cilj;
                prvicv = false;
            }else if (noci.oseba.equals(oseba)){
                if(c.equals(noci.cilj)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    //=========================================================================
    public static int[][] obiskanost(Nocitev[] nocitve, Cilj[] cilji, int minLeto, int maxLeto) {
        int[][] nova = new int[cilji.length][maxLeto-minLeto +1];
        for(int i = 0; i < cilji.length; i++){
            for(int j = 0; j < maxLeto-minLeto +1; j++){
                nova[i][j] = nocitve1(nocitve, minLeto+j, cilji[i]);
            }
        }
        return nova;
    }

    private static int nocitve1(Nocitev[] nocitve, int let, Cilj cil){
        int count = 0;
        for(Nocitev nt: nocitve){
            if(nt.cilj.equals(cil) && nt.leto == let){
                count++;
            }
        }

        return count;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
