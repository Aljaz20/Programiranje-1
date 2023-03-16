import java.util.*;

public class Tocka {
	
	private double x;
	private double y;
	private static final Tocka IZHODISCE = new Tocka(0, 0);

    public Tocka(double x, double y) {
        this.x = x;
		this.y = y;
    }

    public double vrniX() {
        return this.x;
    }

    public double vrniY() {
        return this.y;
    }

    public String toString() {
        return String.format(Locale.US, "(%.2f, %.2f)", this.x, this.y);
    }

   
    public static Tocka izhodisce() {
        return Tocka.IZHODISCE;
    }

    public double razdalja(Tocka t) {
        double razdaljax = this.x - t.x;
		double razdaljay = this.y - t.y;
        return Math.sqrt(razdaljax * razdaljax + razdaljay * razdaljay);
    }

    public double razdaljaOdIzhodisca() {
        return this.razdalja(Tocka.izhodisce());
    }
}
