public class Fibonacci {
	private int a;
	private int b;
	
	public Fibonacci(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int naslednji(){
		int vsota = this.a + this.b;		
		this.a = this.b;
		this.b = vsota;
	return vsota;
	}

}

