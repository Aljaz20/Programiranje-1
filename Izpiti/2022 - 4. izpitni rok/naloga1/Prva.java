
/*
 * Samodejno testiranje:
 * tj.exe Prva.java . .
 *
 * Javni testni primeri:
 * 01, 02: primera iz besedila
 * 03..10: splo"sni primeri
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int d = sc.nextInt();
        int presledki = h-1;
        for(int i = 0; i < presledki; i++){
            System.out.print(" ");
        }
        for(int k = 0; k < d; k++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i = 0; i < h-2; i++){
            for(int j = 0; j < presledki-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int j = 0; j < d+2*i; j++){
                System.out.print(" ");
            }            
            System.out.print("*");
            System.out.println();
            presledki--;
        }
        for(int k = 0; k < 2*(h-1) +d; k++){
            System.out.print("*");
        }

    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
