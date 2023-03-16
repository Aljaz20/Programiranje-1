public class Oseba {
	private String ime;
	private String priimek;
	private char spol;
	private int letoRojstva;
	private Oseba oce;
	private Oseba mati;
	
	public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati){
		this.ime = ime;
		this.priimek = priimek;
		this.spol = spol;
		this.letoRojstva = letoRojstva;
		this.oce = oce;
		this.mati = mati;
	}
	
	public String vrniIme(){
	return this.ime;
	}

	public String toString(){
		return String.format("%s %s (%c), %d", this. ime, this.priimek, this. spol, this.letoRojstva);
	}

	public int starost(int leto){
		return (leto - this.letoRojstva);
	}

	public boolean jeStarejsaOd(Oseba os){
		return this.letoRojstva < os.letoRojstva;
	}

	public static Oseba starejsa(Oseba a, Oseba b){
		if (a.jeStarejsaOd(b)){
			return a;
		}else{
			return (a.letoRojstva == b.letoRojstva) ? (null) : (b);
		}
	}

	public String imeOceta(){
		return (this.oce == null) ? (null) : (this.oce.ime);
	}

	public boolean jeBratAliSestraOd(Oseba os){
		return (this.oce != null && this.mati != null && this.oce == os.oce && this.mati == os.mati && this != os);
	}

	public boolean jeSestraOd(Oseba os){
		return (this.spol == 'Z' && this.jeBratAliSestraOd(os));
	}

	public boolean jeTetaOd(Oseba os){
		return (os.oce != null && os.mati != null && this.jeSestraOd(os.oce) || this.jeSestraOd(os.mati));
	}

	public boolean jeOcetovskiPrednikOd(Oseba os){
		Oseba p = os.oce;
		while(p != null && p!= this){
			p = p.oce;
		}
		return p == this;
	}
}

