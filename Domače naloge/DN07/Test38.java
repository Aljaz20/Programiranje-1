
import java.util.Arrays;
import java.util.Comparator;

public class Test38 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[19][];
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
        os[10] = new Oseba[0];
        os[11] = new Oseba[0];
        os[12] = new Oseba[0];
        os[13] = new Oseba[0];
        os[14] = new Oseba[0];
        os[15] = new Oseba[0];
        os[16] = new Oseba[0];
        os[17] = new Oseba[0];
        os[18] = new Oseba[0];
        
        Stanovanje[] st = new Stanovanje[19];
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
        st[10] = new Stanovanje(os[10]);
        st[11] = new Stanovanje(os[11]);
        st[12] = new Stanovanje(os[12]);
        st[13] = new Stanovanje(os[13]);
        st[14] = new Stanovanje(os[14]);
        st[15] = new Stanovanje(os[15]);
        st[16] = new Stanovanje(os[16]);
        st[17] = new Stanovanje(os[17]);
        st[18] = new Stanovanje(os[18]);
        st[0].nastaviSosede(st[17], st[10], st[13], st[2]);
        st[1].nastaviSosede(null, st[18], st[10], st[17]);
        st[2].nastaviSosede(st[11], st[0], st[9], st[3]);
        st[3].nastaviSosede(st[5], st[2], st[14], st[16]);
        st[4].nastaviSosede(st[9], st[8], null, null);
        st[5].nastaviSosede(null, st[11], st[3], null);
        st[6].nastaviSosede(st[8], null, null, null);
        st[7].nastaviSosede(st[12], null, null, st[8]);
        st[8].nastaviSosede(st[13], st[7], st[6], st[4]);
        st[9].nastaviSosede(st[2], st[13], st[4], st[14]);
        st[10].nastaviSosede(st[1], null, st[12], st[0]);
        st[11].nastaviSosede(null, st[17], st[2], st[5]);
        st[12].nastaviSosede(st[10], null, st[7], st[13]);
        st[13].nastaviSosede(st[0], st[12], st[8], st[9]);
        st[14].nastaviSosede(st[3], st[9], null, null);
        st[15].nastaviSosede(null, null, st[17], null);
        st[16].nastaviSosede(null, st[3], null, null);
        st[17].nastaviSosede(st[15], st[1], st[0], st[11]);
        st[18].nastaviSosede(null, null, null, st[1]);
        
        Oseba[] oss = new Oseba[0];
        Comparator<Oseba> comp = new Comparator<Oseba>() { public int compare(Oseba a, Oseba b) { return a.hashCode() - b.hashCode(); } };
        Arrays.sort(oss, comp);
        Oseba[] rezultat = st[12].sosedjeSosedov();
        Arrays.sort(rezultat, comp);
        TestSkupno.preveri(Arrays.equals(oss, rezultat));
    }
}
