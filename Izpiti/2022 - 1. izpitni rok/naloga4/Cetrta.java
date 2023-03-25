
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        List<T> novi = new ArrayList<>();
        for(int i = 0; i < p ; i++){
            it.next();
        }
        for(int i = p; i <= q; i++){
            novi.add(it.next());
        }
        return novi;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        return new Iteratoree(it, zacetek);
    }

    private static class Iteratoree implements Iterator<Integer>{

        private Integer zacetek;
        private Iterator<Integer> it;
        private Integer indeks;

        public Iteratoree(Iterator<Integer> it, Integer zacetek){
            this.zacetek = zacetek;
            this.it = it;
            this.indeks = it.next();
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        private void naslednji(){
            while(this.indeks.equals(this.zacetek)){
                this.zacetek +=1;
                this.indeks = this.it.next();
             }
        }

        @Override
        public Integer next() {
            Integer a = this.zacetek;
            if(!this.zacetek.equals(this.indeks)){
                this.zacetek ++;
                return a;
            }
            naslednji();
            a = this.zacetek;
            this.zacetek++;
            return  a;
        }

    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
