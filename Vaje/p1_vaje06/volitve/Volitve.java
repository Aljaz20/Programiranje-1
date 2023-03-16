
public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int glasovi = 0;
		for (int i = 0; i < t[leto][stranka].length; i++){
			glasovi += t[leto][stranka][i];
		}
        return glasovi;
    }

    public static int[][] glasovi(int[][][] t) {
        int [][] glas = new int [t.length][t[0].length];
		for (int i = 0; i < t.length; i++){
			for(int j = 0; j < t[i].length; j++){
				int vsota = 0;
				for (int p = 0; p < t[i][j].length; p++){
					vsota += t[i][j][p];
				}
				glas[i][j] = vsota;
			}
		}
        return glas;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int maksimum = 0;
		int indeks = 0;
		for (int i = 0; i < t[0][stranka].length; i++){
			int vsota = 0;
			for (int j = 0; j < t.length ; j++){
				vsota += t[j][stranka][i];
			}
			if ( vsota > maksimum){
				maksimum = vsota;
				indeks = i;
			}
		}
        return indeks;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
		int vsota = 0;
		for (int i = 0; i < t.length; i++){
			int uvrstitev = 1;
			for (int j = 0; j < t[0].length ; j++){
				if (t[i][j][volisce] > t[i][stranka][volisce]){
					uvrstitev++;
				}
			}
			vsota += uvrstitev;
		}
        return vsota;
    }
}
