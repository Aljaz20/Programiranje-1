
import java.util.Arrays;
import java.util.Comparator;

public class Test41 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[10][];
        os[0] = new Oseba[5];
        os[0][0] = new Oseba("a b", 'Z', 9439);
        os[0][1] = new Oseba("a b", 'M', 2515);
        os[0][2] = new Oseba("a b", 'Z', 2291);
        os[0][3] = new Oseba("a b", 'Z', 3604);
        os[0][4] = new Oseba("a b", 'M', 5051);
        os[1] = new Oseba[0];
        os[2] = new Oseba[5];
        os[2][0] = new Oseba("a b", 'Z', 9441);
        os[2][1] = new Oseba("a b", 'Z', 9279);
        os[2][2] = new Oseba("a b", 'Z', 4988);
        os[2][3] = new Oseba("a b", 'M', 793);
        os[2][4] = new Oseba("a b", 'Z', 6256);
        os[3] = new Oseba[1];
        os[3][0] = new Oseba("a b", 'Z', 9527);
        os[4] = new Oseba[4];
        os[4][0] = new Oseba("a b", 'Z', 6526);
        os[4][1] = new Oseba("a b", 'Z', 1976);
        os[4][2] = new Oseba("a b", 'Z', 9443);
        os[4][3] = new Oseba("a b", 'Z', 2866);
        os[5] = new Oseba[4];
        os[5][0] = new Oseba("a b", 'M', 9385);
        os[5][1] = new Oseba("a b", 'M', 1253);
        os[5][2] = new Oseba("a b", 'Z', 7660);
        os[5][3] = new Oseba("a b", 'Z', 2596);
        os[6] = new Oseba[0];
        os[7] = new Oseba[5];
        os[7][0] = new Oseba("a b", 'Z', 2254);
        os[7][1] = new Oseba("a b", 'Z', 1583);
        os[7][2] = new Oseba("a b", 'M', 7668);
        os[7][3] = new Oseba("a b", 'Z', 207);
        os[7][4] = new Oseba("a b", 'Z', 8851);
        os[8] = new Oseba[2];
        os[8][0] = new Oseba("a b", 'Z', 8293);
        os[8][1] = new Oseba("a b", 'M', 681);
        os[9] = new Oseba[5];
        os[9][0] = new Oseba("a b", 'Z', 5883);
        os[9][1] = new Oseba("a b", 'M', 612);
        os[9][2] = new Oseba("a b", 'Z', 4155);
        os[9][3] = new Oseba("a b", 'M', 6403);
        os[9][4] = new Oseba("a b", 'Z', 586);
        
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
        st[0].nastaviSosede(st[8], st[7], null, st[2]);
        st[1].nastaviSosede(st[6], st[2], null, null);
        st[2].nastaviSosede(st[5], st[0], null, st[1]);
        st[3].nastaviSosede(st[9], null, st[7], st[8]);
        st[4].nastaviSosede(null, st[9], st[8], null);
        st[5].nastaviSosede(null, st[8], st[2], st[6]);
        st[6].nastaviSosede(null, st[5], st[1], null);
        st[7].nastaviSosede(st[3], null, null, st[0]);
        st[8].nastaviSosede(st[4], st[3], st[0], st[5]);
        st[9].nastaviSosede(null, null, st[3], st[4]);
        
        Blok blok = new Blok(st[1]);
        TestSkupno.preveri(blok.starosta() == os[3][0]);
    }
}
