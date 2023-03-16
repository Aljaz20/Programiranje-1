
public class Test03 {

    public static void main(String[] args) {
        Oseba o = new Oseba("Cvetka Cajzek", 'Z', 35);
        TestSkupno.preveri(o.toString().equals("Cvetka Cajzek, Z, 35"));
    }
}
