
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int[][] prav = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                prav[i][j] = sc.nextInt();
            }
        }

        int ure = 0;
        int time = 10000;
        int drevesa = 0;
        int prejsni_y = 0;
        int prejsni_x = 0;
        while (drevesa<k && ure < time){
            int x = (prejsni_x + b) % w;
            int y = (prejsni_y + a)% h;

            if(prav[y][x] == 1){
                drevesa++;
            }

            prejsni_x = x;
            prejsni_y = y;
            ure++;

        }

        System.out.print(ure);

    }
}
