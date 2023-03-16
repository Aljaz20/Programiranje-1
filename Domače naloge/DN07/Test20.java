
public class Test20 {
    
    public static void main(String[] args) {

        Stanovanje s = new Stanovanje(new Oseba[0]);
        TestSkupno.preveri(s.steviloStarejsihOd(new Oseba("a b", 'Z', 40)) == 0);
    }
}
