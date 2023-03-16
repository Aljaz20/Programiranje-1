import java.util.Scanner;

public class Zgoscenke {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int količina = 0;
		int i = 1;
		
		while (i <= n && sc.hasNextInt()) {
			int velikost = sc.nextInt();
			količina = količina + velikost;
			if (količina > k){
				i++;
				količina = velikost;
				if (i > n){
					break;
				}
			}
				System.out.printf(velikost + " EP -> zgoscenka " + i + " (" + količina + " EP)%n");
		}
	}
	
}


