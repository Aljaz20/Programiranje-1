import java.util.Scanner;

public class Postevanka3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 1;
		
		while (i * a <= b) {
			int rezultat = a * i;
			System.out.println(a + " * " + i + " = " + rezultat);
			i = i + 1;
		}
	}
	
}


