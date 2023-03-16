
public class Test18 {

    private static double EPSILON = 1e-7;

    public static void main(String[] args) {
        preveri(Premica.skoziTocko(-1.0, new Tocka(0.0, 0.0)), new Premica(-1.0000000, 0.0000000));
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
