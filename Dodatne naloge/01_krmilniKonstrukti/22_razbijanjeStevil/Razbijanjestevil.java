import java.util.Scanner;

public class Razbijanjestevil {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long stevilo = sc.nextLong();
		long stevilka = sc.nextLong();
		long stevilka_temp = stevilka;
		int potenca = 0;
		int potenca_temp = potenca;
		boolean pravilno = false;
		double delitelj = 0;
		double delitelj1 = 0;
		long dolzina1 = 0;
		long output = 0;
		
		for (int i = 18; pravilno == false; i--){
			potenca = i;
			delitelj = (long) Math.pow(10, (double) potenca);
			if (stevilka / (long) delitelj == 0){
				
			}else{
				pravilno = true;
				potenca_temp = potenca;
			}
		}
		for (int j = 0; j < potenca + 1; j++){
			delitelj = (long) Math.pow(10, (double) potenca_temp);
			dolzina1 = dolzina1 + (stevilka_temp / (long) delitelj);
			stevilka_temp = stevilka_temp % (long) delitelj;
			potenca_temp = potenca_temp - 1;
		}
		potenca_temp = potenca;
		
		for (int k = 0; k < potenca + 1; k ++){
			delitelj = (long) Math.pow(10, (double) potenca_temp);
			delitelj1 = (long) Math.pow(10, (double) (dolzina1 - stevilka / (long) delitelj));
			dolzina1 = dolzina1 - stevilka / (long) delitelj;
			stevilka = stevilka % (long) delitelj;
			output = stevilo / (long) delitelj1;
			stevilo = stevilo % (long) delitelj1;
			potenca_temp = potenca_temp - 1;
			System.out.println(output);
		}
		
		
		
	}
	
}


