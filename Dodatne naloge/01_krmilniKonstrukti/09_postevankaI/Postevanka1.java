import java.util.Scanner;

public class Postevanka1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		for (int i = 1; i <= b; i++) {
			int rezultat = a * i;
			System.out.println(rezultat);
		}
	}
	
}


