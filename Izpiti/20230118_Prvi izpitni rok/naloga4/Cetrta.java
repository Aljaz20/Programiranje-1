
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        String a = "";
        if(u == 2){
            a = sc.next();
        }
        String[] ponudnik = new String[n];
        String[] artitekl = new String[n];
        int[] cena = new int[n];
        for(int i = 0; i < n; i++){
            ponudnik[i] = sc.next();
            artitekl[i] = sc.next();
            cena[i] = sc.nextInt();
        }

        if(u == 1){
            Set<String> osebe = new TreeSet();
            for(int i = 0; i < n; i++){
                osebe.add(ponudnik[i]);
            }
            
            for(String s : osebe){
                System.out.println(s);
            }
        }

        if(u==2){
            Map<Integer, String> novo = new TreeMap();
            for(int i = 0; i <n; i++){
                if(artitekl[i].equals(a)){
                    novo.put(cena[i], ponudnik[i]);
                }
            }

            for(Integer akka: novo.keySet()){
                System.out.println(novo.get(akka));
            }
        }
        
    }

    
}
