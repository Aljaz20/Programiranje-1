import java.util.Scanner;

public class Mediana {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((Min(a,b) == a && Min(b,c) == b) || (Max(b,c) == b && Max(a,b) == a)){
			System.out.println(b);
		}else if ((Min(a,b) == b && Min(a,c) == a) || (Max(a,c) == a && Max(a,b) == b)){
			System.out.println(a);
		}else{
			System.out.println(c);
		}
		
	}
	
	public static int Min(int a, int b){
		if (a <= b){
			return a;
		}else{
			return b;
		}
	}
	
	public static int Max(int a, int b){
		if (a >= b){ 	
			return a;
		}else{
			return b;
		}
	} 
	
}



