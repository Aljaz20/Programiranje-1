import java.util.Scanner;
import java.util.Random;

public class Sahovski_popoldnevi {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		int d = sc.nextInt();
		Random rand = new Random(s);
		
		for (int i = 1; i <= d; i++){
			int count = 0;
			int zA = 0;
			int zB = 0;
			String zaporedje = "";
			
			while (count < p && zA < z && zB < z){
				int partija = rand.nextInt(100);
				if (partija < a){
					zA++;
					zaporedje = zaporedje + "A";
				}else if (partija < (a + b)){
					zB++;
					zaporedje = zaporedje + "B";
				}else{
					zaporedje = zaporedje + "r";
				}
				count++;
			}
			System.out.printf("%d. dan: %s (%d)%n", i, zaporedje, count);
		}
	}
}



