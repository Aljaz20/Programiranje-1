
/*
 * tj.exe Prva.java . .
 */

import java.util.Scanner;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		
		for (int i = a; i <= b; i++){
			for (int j = 1; j <= (i + 2); j++){
				if ((i + 2) % j == 0){
					counter1 = counter1 + 1;
				}
			}
			for (int k = 1; k <= i; k++){
				if (i % k == 0){
					counter3 = counter3 + 1;
				}
			}
			if (counter1 < 5 && counter3 == 2){
				counter2 = counter2 + 1;
			}
			counter1 = 0;
			counter3 = 0;
		}
		System.out.println(counter2);
		
    }

}
