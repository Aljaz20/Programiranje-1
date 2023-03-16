import java.util.Scanner;

public class DN03_63220304 {
	static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		long stevilo = 0;		
		int h1 = h;
		int velikost = 1 << k;
		
		for (int j = velikost; j > 0; j /= 2){
			long stevilo1 = 0;
			int potenca = 1;
			int w1 = w;
			
			for (int i = j; i > 0; i /= 2){
				int dolzina = w1 / i;
				stevilo1 += dolzina * potenca;
				w1 = w1 % i;
				potenca *= 2;
			}
			int visina = h1 / j;
			stevilo += visina * stevilo1;
			h1 = h1 % j;
		}		
		System.out.println(stevilo);
	}
	
}


