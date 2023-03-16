import java.util.*;

public class Telefonski_imenik {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] stevilke = new String[n];
		String[] imena = new String[n];
		
		
		for (int l = 0; l < n; l++){
			imena[l] = sc.next();
			stevilke[l] = sc.next();
		}
		
		int k = sc.nextInt();
	
		for (int i = 0; i <k; i++){
			boolean vimenuku = true;
			String novoime = sc.next();
			preverjanje:
			for (int j = imena.length - 1; j >= 0 ; j--){
				String ime = imena[j];
				if (ime.equals(novoime)){
					System.out.printf("%s%n", stevilke[j]);
					vimenuku = false;
					break preverjanje;
				}
			}
			if (vimenuku){
				System.out.println("NEZNANA");
			}
		}
	}
}



