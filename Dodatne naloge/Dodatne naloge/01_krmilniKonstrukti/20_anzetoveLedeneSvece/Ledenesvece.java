import java.util.Scanner;

public class Ledenesvece {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int stevilo = sc.nextInt();
		int dolzina = 3;
		for (int i = 2; i < stevilo; i++){
			dolzina = dolzina * 2 - 1;
		}
		double potenca = 0;
		
		
		
		for (int i = 0; i < stevilo; i++){
			if (i == 0){
				for (int m = 0; m < dolzina; m++){
					System.out.print("*");
				}
			}else{
				potenca = (int) Math.pow (2, (double) i);
				for (int k = 0; k < dolzina; k++){
					if (k % potenca == 0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	
}


