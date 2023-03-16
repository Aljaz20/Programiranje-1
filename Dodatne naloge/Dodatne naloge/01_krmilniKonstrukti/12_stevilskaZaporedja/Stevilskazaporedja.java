import java.util.Scanner;

public class Stevilskazaporedja {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		if (k != 0){
			if (a <= b) {
				if (k > 0){
					while (a <= b) {
						System.out.println(a);
						a = a + k;
					}
				}else if (a == b){
					System.out.println(a);
				}
				else{
					System.out.println("NAPAKA");
				}
			
			}else{
				if (k < 0){
					while (a >= b) {
						System.out.println(a);
						a = a + k;
					}
				}else{
					System.out.println("NAPAKA");
				}
			}
		}else{
			System.out.println("NAPAKA");
		}
	}
	
}


