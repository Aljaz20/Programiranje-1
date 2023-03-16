
public class Test06 {

    public static void main(String[] args) {
        Oseba o1 = new Oseba("ime priimek", 'M', 33);
        Oseba o2 = o1;
        TestSkupno.preveri(!o1.jeStarejsaOd(o2));
    }
}
