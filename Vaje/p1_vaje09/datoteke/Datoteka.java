public abstract class Datoteka {
	
	private String ime;
	
	protected Datoteka(String ime){
		this.ime = ime;
	}
	public String vrniIme(){
		return this.ime;
	}
	
	public abstract int velikost();
	public String toString() {
		return String.format("%s [%s]", this.ime, this.opis());
	}
	
	protected abstract String opis();

}
