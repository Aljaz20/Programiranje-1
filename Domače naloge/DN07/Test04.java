
public class Test04 {

    public static void main(String[] args) {
        Oseba o = new Oseba("Drago Debeljak", 'M', 42);
        TestSkupno.preveri(o.toString().equals("Drago Debeljak, M, 42"));
    }
}
