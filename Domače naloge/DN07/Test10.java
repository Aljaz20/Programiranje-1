
public class Test10 {

    public static void main(String[] args) {
        Oseba o1 = new Oseba("ime priimek", 'M', 33);
        Oseba o2 = new Oseba("ime123 priimek456", 'M', 32);
        TestSkupno.preveri(o1.jeStarejsaOd(o2));
    }
}
