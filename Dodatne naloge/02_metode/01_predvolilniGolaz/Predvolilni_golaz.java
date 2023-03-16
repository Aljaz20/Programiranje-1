import java.util.Scanner;

public class Predvolilni_golaz {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int denar = sc.nextInt();
		
		while (denar > 0 && sc.hasNextInt()) {
			int cena_kosila = sc.nextInt();
			int stevilo_kosil = sc.nextInt();
			int vino = sc.nextInt();
			int cena = Pogostitev(cena_kosila, stevilo_kosil, vino);
			denar = denar - cena;
			if (denar < 0){
				System.out.println(cena + " -");
			}else{
				System.out.println(cena + " " + denar);
			}
		}
	}
	
	public static int Pogostitev(int cena_kosila, int stevilo_kosil, int vino){
		int cena = cena_kosila * stevilo_kosil;
		if (vino == 1) {
			cena = cena + (int) Math.ceil(cena / 2.0);
		}
		return cena;
	} 
	
}



