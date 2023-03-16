
public class Test08 {

    public static void main(String[] args) {
        Oseba o1 = new Oseba("ime priimek", 'M', 34);
        Oseba o2 = new Oseba("ime priimek", 'Z', 33);
        TestSkupno.preveri(o1.jeStarejsaOd(o2));
    }
}
