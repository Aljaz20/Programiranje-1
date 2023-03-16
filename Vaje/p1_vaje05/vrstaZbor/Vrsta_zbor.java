import java.util.Scanner;

public class Vrsta_zbor {
	static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] velikosti = new int[n];
		int counter = 0;
		
		for (int j = 0; j < n; j++){
			velikosti[j] = sc.nextInt();
		}
		
		if (velikosti[0] <= velikosti[1]){
			System.out.printf("%d%n", 0);
			counter++;
		}
		for (int i = 1; i < n - 1; i++){
			if (velikosti[i] >= velikosti[i-1] && velikosti[i] <= velikosti[i + 1]){
				System.out.printf("%d%n", i);
				counter++;
			} 
		}
		if (velikosti[n-1] >= velikosti[n-2]){
			System.out.printf("%d%n", n-1);
			counter++;
		}
		
		if (counter == 0){
			System.out.print("NOBEDEN");
		}

	}
	
}


