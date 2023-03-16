
public class Test02 {

    public static void main(String[] args) {
        Oseba o = new Oseba("Branko Bernik", 'M', 15);
        TestSkupno.preveri(o.toString().equals("Branko Bernik, M, 15"));
    }
}
