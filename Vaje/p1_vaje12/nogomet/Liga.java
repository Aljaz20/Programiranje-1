
import java.util.*;

public class Liga {

    private Collection<String> klubi;
    private Collection<Tekma> tekme;

    public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
        this.klubi = klubi;
        this.tekme = tekme;
    }

    public int steviloTock(String klub) {
        int tocke = 0;
        for (Tekma tek: this.tekme){
            if(klub.equals(tek.getDomaci())){
                if(tek.getGoliDomacih() > tek.getGoliGostov()){
                    tocke += 3;
                }else if(tek.getGoliDomacih() == tek.getGoliGostov()){
                    tocke += 1;
                }
            }else if (klub.equals(tek.getGostje())){
                if(tek.getGoliDomacih() < tek.getGoliGostov()){
                    tocke += 3;
                }else if(tek.getGoliDomacih() == tek.getGoliGostov()){
                    tocke += 1;
                }
            }
        }
        return tocke;
    }

    public Slovar<String, Integer> klub2tocke() {
        //for each element of this.klubi I have to run a steviloTock
        Slovar<String, Integer> klub2tocke = new Slovar<>();
        for (String klub: this.klubi){
            klub2tocke.shrani(klub, steviloTock(klub));
        }

        return klub2tocke;
    }

    public List<String> lestvica() {
        List<String> klubi = new ArrayList<>(this.klubi);
        Slovar<String, Integer> slovar1 = this.klub2tocke();
        klubi.sort(new primerjalniktocke(slovar1));
        return klubi;
    }

    private static class primerjalniktocke implements Comparator<String>{
        private Slovar<String, Integer> slovar;
        public primerjalniktocke(Slovar<String, Integer> slovar){
            this.slovar = slovar;
        }
        @Override
        public int compare(String prvi, String drugi){
            int razlika = this.slovar.vrni(prvi) - this.slovar.vrni(drugi);
            return (razlika == 0) ? (prvi.compareTo(drugi)):(razlika*-1);
        }
    }

    public Iterator<Tekma> poTekmah(int minGR) {
        return new Iteratorpotekmah(this.tekme, minGR);
    }

    private static class Iteratorpotekmah implements Iterator<Tekma> {
        private int minGR;

        private Iterator<Tekma> iterator;
        private Tekma naslednja;

        public Iteratorpotekmah(Collection<Tekma> tekme, int minGR){
            this.minGR = minGR;
            this.iterator = tekme.iterator();
            this.naslednja = this.poiscinaslednjo();
            
        }

        private Tekma poiscinaslednjo(){
            while(this.iterator.hasNext()){ 
                Tekma tekma = this.iterator.next();
                if(tekma.razlika() >= this.minGR){
                    return tekma;
                }
            }
            return null;
        }

        @Override
		public boolean hasNext() {
			return this.naslednja != null;
		}
        @Override
		public Tekma next() {
			if (!this.hasNext()) {
				throw new NoSuchElementException();
			}
			Tekma tekma = this.naslednja;
			this.naslednja = this.poiscinaslednjo();
			return tekma;
		}
    }


}
