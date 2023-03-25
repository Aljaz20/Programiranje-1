
/*
 * tj.exe Prva.java . .
 */

import java.util.Scanner;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int s1 = s;

        int count = 1;
        boolean preveri = false;

        for(int i = 0; i < k; i++){
            int glava = sc.nextInt();
            if(preveri){
                count++;
                preveri = false;
            }
            if(s1-glava < 0){
                count++;
                s1 = s - glava;
            }else if (s1- glava == 0){
                s1 = s;
                preveri = true;
            }else{
                s1 = s1 - glava;
            }
        }
        System.out.println(count);
    }
}
