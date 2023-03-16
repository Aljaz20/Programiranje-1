public class BesedilnaDatoteka extends Datoteka{
	
	private int stZnakov;
	
	public BesedilnaDatoteka(String ime, int stZnakov){
		super(ime);
		this.stZnakov = stZnakov;
	}
	
	@Override
	public int velikost(){
		return this.stZnakov;
	}
	@Override
	public String opis(){
		return String.format("b %d", this.stZnakov);
	}
}

