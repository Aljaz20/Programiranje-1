
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02, 03: manj"sa la"zja primera (vsaka navpi"cna premica seka natanko eno polico)
 * 04..06: ve"cji la"zji primeri
 * 07: manj"si splo"sni primer
 * 08..10: ve"cji splo"sni primeri
 *
 * Skriti testni primeri:
 * 01..25: la"zji
 * 26..50: splo"sni
 *
 * Za vsako polico velja x >= 0, d >= 1, x + d <= m, y >= 1 in y <= m
 * (d je dol"zina police).  Police se med seboj ne prekrivajo.
 */

import java.util.*;

public class Druga {

    public static int najGlobina(int m, int[][] p) {
        int max = 0;
        int[][] tabela = new int[m][m];
        for(int i = 0; i < p.length; i++){
            for(int j = 0; j < p[i][2]; j++){
                tabela[p[i][1]][p[i][0]+j] = 1;
            }
        }
        for(int i = 0; i < m; i++){
            int dolzina = 0;
            for(int j = 0; j < m; j++){
                if(tabela[j][i] == 0){
                    dolzina++;
                }else{
                    break;
                }
            }
            max = (max>dolzina)?(max):(dolzina);
            dolzina=0;
        }
        return max;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
