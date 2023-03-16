
public class Test16 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[1];
        os[0] = new Oseba("a b", 'Z', 1);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.steviloStarejsihOd(os[0]) == 0);
    }
}
