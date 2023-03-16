import java.util.Scanner;

public class DN04_63220304 {
	static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int dolzina = (k < 1001) ? (k - 1) : (1000);
		long[] zaporedje = new long[dolzina];
		long stevilo = 0;
		
		for (int i = 0; i < n; i++){
			int stevilka = sc.nextInt();
			if (stevilka <= dolzina){
				zaporedje[stevilka-1]++;
			}
		}
		for (int j = 0; j <= (k / 2) - 1 && j < dolzina; j++){
			int l = k - j - 2;
			if (l < dolzina && zaporedje[j] > 0 && zaporedje[l] > 0 && j + l + 2 == k){
				stevilo += (j == l) ? (zaporedje[j] * zaporedje[l]) : (zaporedje[j] * zaporedje[l] * 2);
			}
		}		
		System.out.println(stevilo);
	}
}