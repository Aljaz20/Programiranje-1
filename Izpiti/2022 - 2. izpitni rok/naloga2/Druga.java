
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        int max = 0;
        int maxstolpec = 0;

        for (int i = 0; i < slika[0].length; i++){
            int zelena = 0;
            for(int j = 0; j< slika.length; j++){
                if(slika[j][i][0] < slika[j][i][1] && slika[j][i][2] < slika[j][i][1]){
                    zelena++;
                }
            }
            if(max < zelena){
                max = zelena;
                maxstolpec = i;
            }
        }
        return maxstolpec;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
