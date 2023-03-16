
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < 2*a;i++){
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*b; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < a;i++){
            for(int j = 0; j < 4*b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2*a;i++){
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*b; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
