
import java.util.*;

public class Cetrta {

    public static class Avtomat {
        private String zacetnoStanje;
        private Set<String> sprejemnaStanja;
        private Map<String, Map<Character, String>> prehodi;

        public Avtomat(String zacetnoStanje, Set<String> sprejemnaStanja,
                Map<String, Map<Character, String>> prehodi) {

            this.zacetnoStanje = zacetnoStanje;
            this.sprejemnaStanja = sprejemnaStanja;
            this.prehodi = prehodi;
        }

        public String vrniZacetnoStanje() {
            return this.zacetnoStanje;
        }

        public Set<String> vrniSprejemnaStanja() {
            return this.sprejemnaStanja;
        }

        public Map<String, Map<Character, String>> vrniPrehode() {
            return this.prehodi;
        }

        public boolean jeSprejemno(String stanje) {
            if(this.sprejemnaStanja.contains(stanje)){
                return true;
            }
            return false;
        }

        public String kam(String beseda) {
            String trenutno = this.zacetnoStanje;
            for(int i = 0; i < beseda.length(); i++){
                char crka = beseda.charAt(i);
                trenutno = prehodi.get(trenutno).get(crka);
                if(trenutno ==null){
                    return null;
                }
            }
            return trenutno;
        }

        public static Avtomat zaBesedo(String beseda) {
            int dolzina = beseda.length();
            String zacetnoStanje = "0";
            Set<String> sprejemnaStanja = new HashSet<>();
            Map<String, Map<Character, String>> prehodi = new HashMap<>();
            sprejemnaStanja.add(Integer.toString(dolzina));
            for(int i = 0; i < dolzina; i++){
                Map<Character, String> nasl = new HashMap();
                nasl.put(beseda.charAt(i), Integer.toString(i+1));
                prehodi.put(Integer.toString(i), nasl);
            }
            return new Avtomat(zacetnoStanje, sprejemnaStanja, prehodi);
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
