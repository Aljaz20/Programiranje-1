import java.util.Scanner;

public class Najblizjiveckratnik {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int faktor = b / a;
		int veckratnik1 = a * faktor;
		int veckratnik2 = a * (faktor + 1);
		int razlika1 = b - veckratnik1;
		int razlika2 = veckratnik2 - b;
		
		if (razlika1 < razlika2) {
			System.out.println(veckratnik1);
		}else if (razlika2 < razlika1){
			System.out.println(veckratnik2);
		}else {
			System.out.println(veckratnik1);
		}
		
	}
	
}


