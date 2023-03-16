
public class Test17 {
    
    public static void main(String[] args) {
        
        Oseba[] os = new Oseba[10];
        os[0] = new Oseba("a b", 'M', 93);
        os[1] = new Oseba("a b", 'M', 75);
        os[2] = new Oseba("a b", 'Z', 34);
        os[3] = new Oseba("a b", 'Z', 43);
        os[4] = new Oseba("a b", 'Z', 22);
        os[5] = new Oseba("a b", 'M', 64);
        os[6] = new Oseba("a b", 'Z', 49);
        os[7] = new Oseba("a b", 'M', 3);
        os[8] = new Oseba("a b", 'M', 95);
        os[9] = new Oseba("a b", 'Z', 47);
        
        Stanovanje s = new Stanovanje(os);
        TestSkupno.preveri(s.steviloStarejsihOd(os[1]) == 2);
    }
}
