import java.util.Scanner;
import java.util.Random;

public class Najboljse_seme {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		long maksimalna = 0;
		int seme = 0;
		
		for (int i = a; i <= b; i++){
			if (Random_fun(i, n) > maksimalna){
				seme = i;
				maksimalna = Random_fun(i, n);
			}
		}
		
		System.out.println(seme);
		
	}
	
	public static long Random_fun(int a, int n){
		long stevilka = 0;
		Random rand = new Random(a);
		for (int i = 0; i < n ; i++){
			stevilka = stevilka * 10 + rand.nextInt(10);
		}
		return stevilka;
		
	}
	
}



