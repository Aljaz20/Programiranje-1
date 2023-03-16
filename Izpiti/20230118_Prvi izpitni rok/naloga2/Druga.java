
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        
        Character[][] krizanka = new Character[1010][50];
        for(int i = 0; i < krizanka.length; i++){
            for(int j = 0; j < krizanka[i].length; j++){
                krizanka[i][j] = null;
            }}

        for(int i = 0; i < polozaji.length; i++){
            for(int j = 0; j < besede[i].length; j++){
                if(polozaji[i][2] == 'v'){               
                    if(krizanka[polozaji[i][0]-48][polozaji[i][1]+j-48] == null || krizanka[polozaji[i][0]-48][polozaji[i][1]+j-48] == (besede[i][j])){
                        krizanka[polozaji[i][0]-48][polozaji[i][1]+j-48] = besede[i][j];
                    }else{
                        return false;
                    }
                }else{
                    if(krizanka[polozaji[i][0]+j-48][polozaji[i][1]-48] == null || krizanka[polozaji[i][0]+j-48][polozaji[i][1]-48] == (besede[i][j])){
                        krizanka[polozaji[i][0]+j-48][polozaji[i][1]-48] = besede[i][j];
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
