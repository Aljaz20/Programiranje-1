
import java.util.*;

public class Cetrta {

    public static class Prostor {
        private int nadstropje;
        private int kvadratura;
        private String namembnost;

        public Prostor(int nadstropje, int kvadratura, String namembnost) {
            this.nadstropje = nadstropje;
            this.kvadratura = kvadratura;
            this.namembnost = namembnost;
        }

        @Override
        public String toString() {
            return String.format("%d. nadstropje / %s m^2 / %s",
                    this.nadstropje, this.kvadratura, this.namembnost);
        }

        // po potrebi dopolnite ...
    }

    public static Set<String> namembnosti(List<Prostor> prostori) {
        Set<String> novo = new HashSet<>();
        for(Prostor pr: prostori){
            novo.add(pr.namembnost);
        }
        return novo;
    }

    public static void uredi(List<Prostor> prostori) {
        int stElementov = prostori.size();
        for (int i = 1;  i < stElementov;  i++) {
            Prostor element = prostori.get(i);
            int j = i - 1;
            while (j >= 0 && primerjalnikPonadstzopjih().compare(prostori.get(j), element) > 0) {
                prostori.add(j + 1, prostori.get(j));
                prostori.remove(j+2);
                j--;
            }
            prostori.add(j + 1, element);
            prostori.remove(j+2);
        }
    }


    private static class Primerjalnikponadstropku implements Comparator<Prostor> {
        @Override
        public int compare(Prostor prva, Prostor druga) {
            if (prva.nadstropje == druga.nadstropje) {
                return druga.kvadratura - prva.kvadratura;  // najprej starejši, potem mlajši
            }
            return prva.nadstropje - druga.nadstropje;   // najprej ženske, potem moški
        }
    }

    public static Comparator<Prostor> primerjalnikPonadstzopjih() {
        return new Primerjalnikponadstropku();
    }

    public static Map<Integer, Map<String, Integer>> statistika(List<Prostor> prostori) {
        Map<Integer, Map<String, Integer>> nova = new HashMap<>();
        
        Integer stevilo = 0;
        int nadstropja = 0;
        for(Prostor pr: prostori){
            if(pr.nadstropje > nadstropja){
                nadstropja = pr.nadstropje;
            }
        }

        for(int i = 1; i <= nadstropja; i++ ){
            Map<String, Integer> prost = new HashMap<>();
            for(Prostor pr: prostori){
                if(pr.nadstropje == i){
                    if(prost.containsKey(pr.namembnost)){
                        int st = prost.get(pr.namembnost) +1;
                        prost.put(pr.namembnost, st);
                    }else{
                        prost.put(pr.namembnost, 1);
                    }
                }
            }
            nova.put(i, prost);
        }
        
        return nova;
    }
}
