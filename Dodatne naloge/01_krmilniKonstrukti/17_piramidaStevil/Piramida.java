import java.util.Scanner;

public class Piramida {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int vrstice = sc.nextInt();
		int vrstice1 = vrstice;
		int stevilka = 1;
		String izpis = Integer.toString(stevilka);
		String remove = "";
		
		for (int i = 0; i < vrstice1; i++){
			System.out.printf("%"+ vrstice+ "s%n", izpis);
			
			vrstice = vrstice + 1;
			remove = Integer.toString((i + 1) % 10);
			izpis = izpis.replaceFirst(remove, "");
			for (int j = 0; j < 3; j++){
				stevilka = (stevilka + 1) % 10;
				izpis = izpis + stevilka;
			}
		}
		
	}
	
}


