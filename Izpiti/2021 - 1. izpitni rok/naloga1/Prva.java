
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int stevilo = sc.nextInt();
            int st2 = stevilo;
            int prejsno = 0;
            boolean izpisi = true;
            for(int j = 0; j < (int)Math.log10(stevilo)+1; j++){
                if(st2<10){
                    if(st2 >= prejsno){
                        break;
                    }else{
                        izpisi = false;
                        break;
                    }
                    
                }else{
                    if(st2 % 10 >= prejsno){
                        prejsno = st2 % 10;
                        st2 = st2/10;
                        continue;
                    }else{
                        izpisi = false;
                        break;
                    }
                }
                
            }
            if(izpisi){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
