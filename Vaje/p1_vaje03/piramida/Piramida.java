import java.util.Scanner;

public class Piramida {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int vrstice = sc.nextInt();
		int vrstice1 = vrstice;
		String izpis = "*";
		
		for (int i = 0; i < vrstice1; i++){
			System.out.printf("%"+ vrstice + "s%n", izpis);
			izpis = izpis + "**";
			vrstice = vrstice + 1;
		}
		
	}
	
}


