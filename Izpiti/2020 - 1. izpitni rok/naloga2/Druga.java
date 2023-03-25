
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int najCas(int[][] t, int krog) {
        int cas = Integer.MAX_VALUE;
        for(int i = 0; i < t.length; i++){
            if(t[i][krog] < cas){
                cas = t[i][krog] ;
            }
        }
        return cas;
    }

    public static int[][] kumulativa(int[][] t) {
        int[][] nova = new int[t.length][t[0].length];
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(j == 0){
                    nova[i][j] = t[i][j];
                }else{
                    nova[i][j] = nova[i][j-1] + t[i][j];
                }
            }
        }
        return nova;
    }
}
