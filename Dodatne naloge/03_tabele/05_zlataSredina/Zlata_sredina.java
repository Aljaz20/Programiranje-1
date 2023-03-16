import java.util.*;

public class Zlata_sredina {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] stevilke = new int[2*k + 1];
		int counter = 0;
		
		for (int i = 0; i < 2*k + 1; i++){
			int element = sc.nextInt();
			int j = i - 1;
			while (j >= 0 && stevilke[j] > element) {
				stevilke[j + 1] = stevilke[j];
				j--;
			}
			stevilke[j + 1] = element;
		}
		
		System.out.printf("%d%n", stevilke[k]);
	}
}



