
public class SlikovnaDatoteka extends Datoteka{
	
	private int sirina;
	private int visina;
	private static final int METAPODATKI = 54;
	
	public SlikovnaDatoteka(String ime, int sirina, int visina){
		super(ime);
		this.sirina = sirina;
		this.visina = visina;
	}
	
	@Override
	public int velikost(){
		return this.sirina * this.visina * 3 + METAPODATKI;
	}
	
	@Override
	public String opis(){
		return String.format("s %d x %d", this.sirina, this.visina);
	}
	
	public boolean jeVelikaVsaj(int prag){
		return this.sirina >= prag && this.visina >= prag;
	}

	

}