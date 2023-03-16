
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

    public static <T> List<T> razmnozi(List<T> seznam, int n) {
        List<T> vrni = new ArrayList<>();
        for(int i = 0; i < seznam.size(); i++){
            int ostanek = i % n;
            for(int j = 0; j < ostanek+1; j++){
                vrni.add(seznam.get(i));
            }
        }
        return vrni;
    }

    public static <T> Iterator<T> razmnozevalnik(List<T> seznam, int n) {
        return new Iteratorrazmnozevalnik(seznam, n);
    }

    private static class Iteratorrazmnozevalnik<T> implements Iterator<T> {

        private List<T> seznam;
        private int n;
        private int ostanek;
        private int stevec;
        private int j;

        public Iteratorrazmnozevalnik(List<T> seznam, int n){
            this.seznam = seznam;
            this.n = n;
            this.stevec = 0;
            this.ostanek = stevec % n;
            this.j = 0;
        }

        @Override
        public boolean hasNext() {
            if((this.stevec == this.seznam.size() - 1)&&(this.j == this.ostanek+1)){
                return false;
            }
            return this.stevec < this.seznam.size();
        }

        @Override
        public T next(){
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            
            if(this.j < this.ostanek+1){
                this.j++;
                
            }else{
                this.stevec++;
                this.ostanek = stevec%n;
                this.j = 1;
            }
            return seznam.get(stevec);
        }


    }
}
