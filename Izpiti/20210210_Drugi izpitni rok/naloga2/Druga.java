
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] matrika = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j< w; j++){
                matrika[i][j] = sc.nextInt();
            }
        }
        int prejsni = 0;
        int vzpon = 0;
        int padec = 0;

        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(matrika[j][i] == 1){
                    if(i == 0){
                        prejsni = j;
                        
                    }else{
                        if(prejsni >= j){
                            vzpon = vzpon + prejsni - j;
                        }else{
                            padec = padec - prejsni + j;
                        }
                        prejsni = j;
                    }
                    break;
                    
                }else if(j == h-1){
                    if(i == 0){
                        prejsni = h;
                        
                    }else{
                        if(prejsni >= j){
                            vzpon = vzpon + prejsni - j;
                        }else{
                            padec = padec - prejsni + j;
                        }
                        prejsni = h;
                    }
                    break;
                }
            }
        }
        System.out.println(vzpon);
        System.out.println(padec);
    }
}
