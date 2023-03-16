import java.util.Scanner;

public class Najblizji_element {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] stevila = new int[n];
		int indeks = 0;
		int l = 0;
		
		for (int i = 0; i < n; i++){
			stevila[i] = sc.nextInt();
		}
		int razlika = (int) Math.abs(k - stevila[0]);
		for (int j: stevila){
			if ((int) Math.abs(k - j) < razlika){
				razlika = (int) Math.abs(k - j);
				indeks = l;
			}
			l++;
		}
		System.out.println(indeks);
	}
}



