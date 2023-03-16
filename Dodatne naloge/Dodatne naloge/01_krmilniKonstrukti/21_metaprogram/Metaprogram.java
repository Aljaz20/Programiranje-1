import java.util.Scanner;

public class Metaprogram {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int stevilo = sc.nextInt();
		int stevilka = 0;
		String besedilo = "";
		
		
		System.out.println("public class Nizi {");
		System.out.println("    public static void main(String[] args) {");
		
		for (int i = 0; i < stevilo; i++){
			stevilka = i + 1;
			for (int j = 0; j < (i + 2) * 4; j++){
				System.out.print(" ");
			}
			System.out.print("for (char c" + stevilka + " = \'A\';  c" + stevilka + " <= \'Z\';  c" + stevilka + "++) {");
			besedilo = besedilo + " + c" + stevilka;
			System.out.println();
		}
		stevilka = stevilka + 2;
		for (int k = 0; k < (stevilka) * 4; k++){
			System.out.print(" ");
		}
		System.out.println("System.out.println(\"\"" + besedilo + ");");
		
		for (int l = 0; l < stevilo + 2; l++){
			stevilka = stevilka - 1;
			for (int m = 0; m < (stevilka) * 4; m++){
				System.out.print(" ");
			}
			System.out.print("}");
			System.out.println();
		}
		
	}
	
}


