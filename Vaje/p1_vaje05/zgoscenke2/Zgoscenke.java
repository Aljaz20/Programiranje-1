import java.util.*;

public class Zgoscenke {
	//static Scanner sc;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] velikosti = new int[n];
		boolean prostor = true;
		int minimum = 0;
		
		for (int j = 0; j < n; j++){
			velikosti[j] = 0;
		}
		while (sc.hasNextInt() && prostor){
			int datoteka = sc.nextInt();
			int min = k;			
			for (int i = 0; i < velikosti.length; i++){
				if (velikosti[i] < min){
					minimum = i;
					min = velikosti[i];
				}
			}
			if (datoteka + min > k){
				prostor = false;
			}else{
				velikosti[minimum] = velikosti[minimum] + datoteka;
				System.out.printf("%d EP -> zgoscenka %d %s%n", datoteka, minimum + 1, Arrays.toString(velikosti));
			}
		}

	}
	
}


