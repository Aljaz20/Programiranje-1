
import java.util.Arrays;

public class Test32 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[10][];
        os[0] = new Oseba[0];
        os[1] = new Oseba[0];
        os[2] = new Oseba[0];
        os[3] = new Oseba[0];
        os[4] = new Oseba[0];
        os[5] = new Oseba[0];
        os[6] = new Oseba[0];
        os[7] = new Oseba[0];
        os[8] = new Oseba[0];
        os[9] = new Oseba[0];
        
        Stanovanje[] st = new Stanovanje[10];
        st[0] = new Stanovanje(os[0]);
        st[1] = new Stanovanje(os[1]);
        st[2] = new Stanovanje(os[2]);
        st[3] = new Stanovanje(os[3]);
        st[4] = new Stanovanje(os[4]);
        st[5] = new Stanovanje(os[5]);
        st[6] = new Stanovanje(os[6]);
        st[7] = new Stanovanje(os[7]);
        st[8] = new Stanovanje(os[8]);
        st[9] = new Stanovanje(os[9]);
        st[0].nastaviSosede(st[5], st[4], null, null);
        st[1].nastaviSosede(null, null, null, st[9]);
        st[2].nastaviSosede(null, null, st[9], st[7]);
        st[3].nastaviSosede(null, null, st[6], null);
        st[4].nastaviSosede(st[9], null, null, st[0]);
        st[5].nastaviSosede(st[7], st[9], st[0], st[8]);
        st[6].nastaviSosede(st[3], st[7], st[8], null);
        st[7].nastaviSosede(null, st[2], st[5], st[6]);
        st[8].nastaviSosede(st[6], st[5], null, null);
        st[9].nastaviSosede(st[2], st[1], st[4], st[5]);
        
        TestSkupno.preveri(st[3].starostaSosescine() == null);
    }
}
