import java.util.Arrays;
public class Stanovanje {

    private Oseba[] stanovalci;
    private Stanovanje[] sosedi;

    public Stanovanje(Oseba[] stanovalci) {
        this.stanovalci = stanovalci;
        this.sosedi = null;
    }

    public int steviloStanovalcev() {
        return this.stanovalci.length;
    }

    public int steviloStarejsihOd(Oseba os) {
        int counter = 0;
        for(Oseba ljudje: this.stanovalci) {
            if(ljudje.jeStarejsaOd(os)) {
                counter++;
            }
        }
        return counter;
    }

    public int[] mz() {
        int[] spoli = {0, 0};
        for (Oseba ljudje: this.stanovalci) {
            if(ljudje.spol == 'M') {
                spoli[0]++;
            } else {
                spoli[1]++;
            }
        }
        return spoli;
    }

    public Oseba starosta() {
        if (this.stanovalci.length == 0) {
            return null;        
        }else{
            Oseba maxstarost = this.stanovalci[0];
            for (Oseba ljudje: this.stanovalci){
                if(ljudje.starost > maxstarost.starost) {
                    maxstarost = ljudje;
                }
            }
            return maxstarost;
        }
        
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        
            this.sosedi = new Stanovanje[]{levi, zgornji, desni, spodnji};
    }

    public Oseba starostaSosescine() {
        Oseba max = this.starosta();
        for (Stanovanje sosedi: this.sosedi){
            if (sosedi == null || sosedi.stanovalci.length == 0){
                continue;
            }else if (sosedi.starosta().starost > max.starost) {
                max = sosedi.starosta();
            }
        }
        return max;
    }

    public Oseba[] sosedjeSosedov() {
        Stanovanje[] nepodvojena = new Stanovanje[16];
        nepodvojena[0] = this;
        int a = 1;
        int counter = 0;
        Oseba[] osebetemp = new Oseba[10000];
        for (Stanovanje stanovanje1: this.sosedi) {
            if (stanovanje1 != null) {
                for (Stanovanje stanovanje2: stanovanje1.sosedi) {
                    if (stanovanje2 != null && nepodvojeno(nepodvojena, stanovanje2)) {
                        nepodvojena[a] = stanovanje2;
                        a++;
                        System.arraycopy(stanovanje2.stanovalci, 0, osebetemp, counter, stanovanje2.steviloStanovalcev());
                        counter += stanovanje2.steviloStanovalcev();
                    }
                }
            }
        }
        
        return Arrays.copyOf(osebetemp, counter);

        
    }

    private static boolean nepodvojeno(Stanovanje[] nepodvojena, Stanovanje stanovanje) {
        for (Stanovanje stanovnaje1: nepodvojena) {
            if (stanovnaje1 == stanovanje) {
                return false;
            }
        }
        return true;
    }
}
