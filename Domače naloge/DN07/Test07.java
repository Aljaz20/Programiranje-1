
public class Test07 {

    public static void main(String[] args) {
        Oseba o1 = new Oseba("ime priimek", 'M', 33);
        Oseba o2 = new Oseba("ime priimek", 'Z', 33);
        TestSkupno.preveri(!o1.jeStarejsaOd(o2));
    }
}
