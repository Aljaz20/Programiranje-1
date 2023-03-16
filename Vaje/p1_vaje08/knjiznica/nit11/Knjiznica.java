public class Knjiznica {
	private int[][] izposoja;
	private int stIzvodovNaNaslov;
	private int [] najizposoja;
	
	public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
		this.izposoja = new int [stNaslovov][stClanov];
		this.stIzvodovNaNaslov = stIzvodovNaNaslov;
		this.najizposoja = new int [stNaslovov];
	
		for (int i = 0; i < stNaslovov; i++){
			this.najizposoja[i] = 0;
			for (int j = 0; j < stClanov; j++){
				this.izposoja[i][j] = 0;
			}
		}
	}
	public boolean posodi(int clan, int naslov){
		int vsota = 0;
		for (int k = 0; k < this.izposoja[naslov].length; k++){
			vsota += this.izposoja[naslov][k];
		}
		if (this.izposoja[naslov][clan] == 0 && vsota < stIzvodovNaNaslov){
			this.izposoja[naslov][clan] = 1;
			this.najizposoja[naslov]++;
			return true;
		}else{
			return false;
		}
	}
	public void clanVrne(int clan){
		for (int l = 0; l < this.izposoja.length; l++){
			this.izposoja[l][clan] = 0;
		}
		
	}
	public int posojeni(int naslov){
		int vsota = 0;
		for (int h = 0; h < this.izposoja[naslov].length; h++){
			vsota += this.izposoja[naslov][h];
		}
		return vsota;
	}
	public int priClanu(int clan){
		int vsota = 0;
		for (int m = 0; m < this.izposoja.length; m++){
			vsota += this.izposoja[m][clan];
		}
		return vsota;
	}
	 public int najNaslov(){
		 int max = 0;
		 int maxk = 0;
		 for (int n = 0; n < this.najizposoja.length; n++){
			 if (this.najizposoja[n] > max){
				 max = najizposoja[n];
				 maxk = n;
			 }
		 }
		 return maxk;
	 }

}

