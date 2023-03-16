import java.util.*;

public class Premica {
	
	private double k;
	private double n;

    public Premica(double k, double n) {
		this.k = k;
		this.n = n;
    }

    public double vrniK() {
        return this.k;
    }

    public double vrniN() {
        return this.n;
    }

    public String toString() {
        return String.format(Locale.US, "y = %.2f x + %.2f", this.k, this.n);
    }

    public Tocka tockaPriX(double x) {
        double y = this.k * x + this.n;
        return new Tocka(x, y);
    }

    public static Premica skoziTocko(double k, Tocka t) {
        double n = t.vrniY() - k * t.vrniX();
        return new Premica(k, n);
    }

    public Premica vzporednica(Tocka t) {
        return Premica.skoziTocko(this.k, t);
    }

    public Premica pravokotnica(Tocka t) {
        return Premica.skoziTocko(-1 / k, t);
    }

    public Tocka presecisce(Premica p, double epsilon) {
        if (Math.abs(this.k - p.k) < epsilon){
			return null;
		}else{
			double x = (this.n - p.n) / (p.k - this.k);
			return this.tockaPriX(x);
		}
    }

    public Tocka projekcija(Tocka t) {
		Premica l = this.pravokotnica(t);  
        return this.presecisce(l, 0);
    }

    public double razdalja(Tocka t) {
        Tocka l = this.projekcija(t);
        return t.razdalja(l);
    }

    public double razdaljaOdIzhodisca() {
        return this.razdalja(Tocka.izhodisce());
    }

    public double razdalja(double n) {
		Premica d = new Premica(this.k, n);
		Tocka premicad = d.tockaPriX(0);
        return this.razdalja(premicad);
    }
}
