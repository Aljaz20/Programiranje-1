import java.util.Scanner;

public class Collatzovo_zaporedje {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int maks = 0;
		int maksimum = 0;
		

	
		for (int i = a; i <= b; i++){
			int stevilo = i;
			int counter = 1;
			while (stevilo > 1){
				if (stevilo % 2 == 0){
					stevilo = stevilo / 2;
				}else {
					stevilo = stevilo * 3 + 1;
				}
				counter++;
			}
			if (counter > maks){
				maks = counter;
				maksimum = i;
			}
		}
		System.out.println(maksimum);
		System.out.println(maks);
	}
}



