
public class Test37 {

    private static double EPSILON = 1e-7;

    public static void main(String[] args) {
        Premica p = new Premica(9.5, -7.3);
        Tocka t = new Tocka(-6.2, -2.5);
        preveri(p.projekcija(t), new Tocka(0.4317808, -3.1980822));
    }

    private static void preveri(double dobljeno, double pricakovano) {
        System.out.println(steviliEnaki(pricakovano, dobljeno));
    }

    private static void preveri(String dobljeno, String pricakovano) {
        System.out.println(nizaEnaka(pricakovano, dobljeno));
    }

    private static void preveri(Tocka dobljeno, Tocka pricakovano) {
        System.out.println(tockiEnaki(pricakovano, dobljeno));
    }

    private static void preveri(Premica dobljeno, Premica pricakovano) {
        System.out.println(premiciEnaki(pricakovano, dobljeno));
    }

    private static boolean tockiEnaki(Tocka a, Tocka b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return steviliEnaki(a.vrniX(), b.vrniX()) && steviliEnaki(a.vrniY(), b.vrniY());
    }

    private static boolean premiciEnaki(Premica a, Premica b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return steviliEnaki(a.vrniK(), b.vrniK()) && steviliEnaki(a.vrniN(), b.vrniN());
    }

    private static boolean steviliEnaki(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private static boolean nizaEnaka(String a, String b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }
}
