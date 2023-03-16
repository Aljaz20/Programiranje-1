import java.util.Scanner;

public class Casovnarazlika2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int cas1 = h1 * 60 + m1;
		int cas2 = h2 * 60 + m2;
		int razlika = cas2 - cas1;
		int ure = razlika / 60;
		int minute = razlika % 60;
		
		if (minute < 10) {
			System.out.println(ure + ":0" + minute);
		}else{
			System.out.println(ure + ":" + minute);
		}
		
	}
	
}


