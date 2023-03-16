import java.util.Scanner;
import java.util.Arrays;

public class Pascalov_trikotnik {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stevilke = new int[n+1];
		int[] stevilke1 = new int[n+1];
		
		stevilke[0] = 1;
		for (int l = 1; l <= n; l++){
			stevilke[l] = 0;
		}
	
		for (int i = 0; i <= n; i++){
			int stevilka = 1;
			for (int j = 1; j < i; j++){
				stevilka = stevilke1[j - 1] + stevilke1[j];
				stevilke[j] = stevilka;
			}
			stevilke[i] = 1;
			for (int k = 0; k <= i; k++){
				System.out.print(stevilke[k]);
				stevilke1[k] = stevilke[k];
				if (k < i){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}
	}
}



