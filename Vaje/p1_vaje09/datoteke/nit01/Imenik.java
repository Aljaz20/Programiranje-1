
public class Imenik extends Datoteka{
	
	private Datoteka[] datoteke;
	private static final int METAPODATKI = 256;
	
	public Imenik(String ime, Datoteka[] datoteke){
		super(ime);
		this.datoteke = datoteke;
	}
	
	@Override
	public int velikost(){
		int rezultat = METAPODATKI;
		for (Datoteka datoteke: this.datoteke){
			rezultat += datoteke.velikost();
		}
		return  rezultat;
	}
	
	@Override
	public String opis(){
		return String.format("i %d", this.datoteke.length);
	}
	
	public int steviloVecjihSlik(int prag){
		int stevec = 0;
		for (Datoteka datoteka: this.datoteke){
			if (datoteka instanceof SlikovnaDatoteka){
				SlikovnaDatoteka slika = (SlikovnaDatoteka) datoteka;
				if (slika.jeVelikaVsaj(prag)){
					stevec++;
				}
			}
		}
		return stevec;
	}
	
	public String poisci(String ime){
		return this.poisci(".", ime);
	}
	
	private String poisci(String pot, String ime){
		for(Datoteka datoteka: this.datoteke){
			if (datoteka.vrniIme().equals(ime)){
				return pot + "/" + ime;
			}
		}
		
		for (Datoteka datoteka: this.datoteke){
			if (datoteka instanceof Imenik){
				Imenik imenik = (Imenik) datoteka;
				String rezultat = imenik.poisci(pot +  "/" + imenik.vrniIme(), ime);
				if(rezultat != null){
					return rezultat;
				}
			}
		}
		return null;
	}
	
	


}