
public class Test09 {

    public static void main(String[] args) {
        Oseba o1 = new Oseba("ime priimek", 'M', 33);
        Oseba o2 = new Oseba("ime priimek", 'Z', 34);
        TestSkupno.preveri(o2.jeStarejsaOd(o1));
    }
}
