
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int visina = igralci.length / 2;
        int razdalja = 0;
        
        if (smer == 1){
            for(int l = 1; l < igralci[0].length - strelec; l++){
                int zoga = strelec + l;
                razdalja++;
                for(int i = strelec+l; i < igralci[0].length-1; i++){
                    for(int j = 0; j < igralci.length; j++){
                        if(j!=visina){
                            if(igralci[j][i] == true){
                                if(j < visina){
                                    igralci[j+1][i] = true;
                                    igralci[j][i] = false;
                                    j++;
                                }else{
                                    igralci[j-1][i] = true;
                                    igralci[j][i] = false;
                                }
                            }
                        }
                        
                    }
                }
                if(igralci[visina][zoga] == true){
                    break;
                }
            }
        }else{
            for(int l = strelec-1; l >=0 ; l--){
                int zoga = l;
                razdalja++;
                for(int i = 1; i < l+1; i++){
                    for(int j = 0; j < igralci.length; j++){
                        if(igralci[j][i] == true){
                            if(j!=visina){
                                if(j <= visina){
                                    igralci[j+1][i] = true;
                                    igralci[j][i] = false;
                                    j++;
                                }else{
                                    igralci[j-1][i] = true;
                                    igralci[j][i] = false;
                                }
                            }
                        }
                    }
                }
                if(igralci[visina][zoga] == true){
                    break;
                }
            }
        }
        return razdalja;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
