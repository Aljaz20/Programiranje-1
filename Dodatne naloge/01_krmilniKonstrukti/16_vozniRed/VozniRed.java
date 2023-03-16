import java.util.Scanner;

public class VozniRed {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int interval = sc.nextInt();
		int st_vozenj = ((h2 * 60 + m2) - (h1 * 60 + m1)) / interval + 1;
		int ura = 0;
		int minuta = 0;
		
		for (int i = 0; i < st_vozenj; i++){
			ura = (h1 * 60 + m1 + i * interval) / 60;
			minuta = (h1 * 60 + m1 + i * interval) % 60;
			System.out.printf("%02d:%02d%n", ura , minuta);
		}
	}	
}


