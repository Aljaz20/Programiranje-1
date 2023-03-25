
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int prejsni = 0;
        int treuntni = a;
        int skupaj = a;
        int count= 1;

        while(k > skupaj){
            prejsni = treuntni;
            treuntni += b;
            skupaj += treuntni;
            count++;
        }

        System.out.print(count);
    }
}
