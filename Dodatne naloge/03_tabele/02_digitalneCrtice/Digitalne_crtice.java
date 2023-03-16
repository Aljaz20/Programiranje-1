import java.util.Scanner;

public class Digitalne_crtice {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int[] stevilke = new int[n];
		int maks = 0;
		int maksimum = 0;
		
		for (int i = 0; i < n; i++){
			stevilke[i] = sc.nextInt();
		}
	
		for (int j: stevilke){
			int vsota = 0;
			int stevke = (int) Math.log10(j);
			int j1 = j;
			for (int k = stevke; k >= 0; k--){
				int pozicija = j1 % 10;
				vsota = vsota + crtice[pozicija];
				j1 = j1 / 10;
			}
			if (vsota > maks){
				maks = vsota;
				maksimum = j;
			}
		}
		System.out.println(maksimum);
	}
}



