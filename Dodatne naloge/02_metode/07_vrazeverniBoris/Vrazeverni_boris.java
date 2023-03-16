import java.util.Scanner;
import java.util.Random;

public class Vrazeverni_boris {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		Random rand = new Random(s);
		String dan = "D";
		int liha = 0;
		
		for (int i = 1; i <= n; i++){
			int counter = 0;
			String pike = "";
			if (i % 7 == 0){
				dan = "N";
				liha = 5;
			}else{
				dan = "D";
				liha = 3;
			}
			while (liha > 0){
				int stPik = rand.nextInt(6) + 1;
				pike = pike + " " + stPik;
				counter++;
				if (stPik % 2 == 1){
					liha = liha - 1;
				}
			}
			
			System.out.printf("%4d (%s):%s [%d]%n", i, dan, pike, counter);
		}
	}
}



