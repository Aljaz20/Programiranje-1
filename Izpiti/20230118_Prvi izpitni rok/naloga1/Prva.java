
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prva = sc.nextInt();
        int druga = sc.nextInt();
        int vsota = prva + druga;
        int max = vsota;

        while(sc.hasNextInt()){
            prva = druga;
            druga = sc.nextInt();
            vsota = prva + druga;
            max = (max<vsota)?(vsota):(max);

        }

        System.out.print(max);
    }
}
