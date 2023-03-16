
import java.util.Arrays;
import java.util.Comparator;

public class Test37 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[1][];
        os[0] = new Oseba[4];
        os[0][0] = new Oseba("a b", 'M', 6257);
        os[0][1] = new Oseba("a b", 'Z', 8562);
        os[0][2] = new Oseba("a b", 'Z', 4809);
        os[0][3] = new Oseba("a b", 'M', 6170);
        
        Stanovanje[] st = new Stanovanje[1];
        st[0] = new Stanovanje(os[0]);
        st[0].nastaviSosede(null, null, null, null);
        
        Oseba[] oss = new Oseba[0];
        Comparator<Oseba> comp = new Comparator<Oseba>() { public int compare(Oseba a, Oseba b) { return a.hashCode() - b.hashCode(); } };
        Arrays.sort(oss, comp);
        Oseba[] rezultat = st[0].sosedjeSosedov();
        Arrays.sort(rezultat, comp);
        TestSkupno.preveri(Arrays.equals(oss, rezultat));
    }
}
