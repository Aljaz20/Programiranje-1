import java.util.Scanner;

public class Anka {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int counter = 0;
		
		for (int i = 1 ; i < 10 ; i += 2) {
			for (int j = 1; j < 10; j++){
				if (j > m){
					for (int k = 0; k < 10; k++){
						if (k % d == 0){
							System.out.printf(i + "-" + j + "-" + k + "%n");
							counter++;
						}
					}
				}
			}
			
		}
		System.out.print(counter);
	}
	
}


