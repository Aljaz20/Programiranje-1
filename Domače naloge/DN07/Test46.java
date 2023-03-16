
import java.util.Arrays;
import java.util.Comparator;

public class Test46 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[7][];
        os[0] = new Oseba[5];
        os[0][0] = new Oseba("a b", 'M', 3908);
        os[0][1] = new Oseba("a b", 'Z', 3118);
        os[0][2] = new Oseba("a b", 'Z', 4087);
        os[0][3] = new Oseba("a b", 'Z', 4312);
        os[0][4] = new Oseba("a b", 'Z', 1630);
        os[1] = new Oseba[5];
        os[1][0] = new Oseba("a b", 'M', 8647);
        os[1][1] = new Oseba("a b", 'M', 4950);
        os[1][2] = new Oseba("a b", 'M', 394);
        os[1][3] = new Oseba("a b", 'M', 2925);
        os[1][4] = new Oseba("a b", 'M', 7912);
        os[2] = new Oseba[4];
        os[2][0] = new Oseba("a b", 'Z', 3246);
        os[2][1] = new Oseba("a b", 'Z', 9950);
        os[2][2] = new Oseba("a b", 'Z', 9975);
        os[2][3] = new Oseba("a b", 'M', 1380);
        os[3] = new Oseba[3];
        os[3][0] = new Oseba("a b", 'M', 9065);
        os[3][1] = new Oseba("a b", 'M', 8938);
        os[3][2] = new Oseba("a b", 'M', 3904);
        os[4] = new Oseba[2];
        os[4][0] = new Oseba("a b", 'M', 1293);
        os[4][1] = new Oseba("a b", 'M', 9352);
        os[5] = new Oseba[0];
        os[6] = new Oseba[1];
        os[6][0] = new Oseba("a b", 'Z', 3313);
        
        Stanovanje[] st = new Stanovanje[7];
        st[0] = new Stanovanje(os[0]);
        st[1] = new Stanovanje(os[1]);
        st[2] = new Stanovanje(os[2]);
        st[3] = new Stanovanje(os[3]);
        st[4] = new Stanovanje(os[4]);
        st[5] = new Stanovanje(os[5]);
        st[6] = new Stanovanje(os[6]);
        st[0].nastaviSosede(st[6], st[4], st[1], null);
        st[1].nastaviSosede(st[0], st[3], null, null);
        st[2].nastaviSosede(null, null, st[4], st[6]);
        st[3].nastaviSosede(st[4], null, st[5], st[1]);
        st[4].nastaviSosede(st[2], null, st[3], st[0]);
        st[5].nastaviSosede(st[3], null, null, null);
        st[6].nastaviSosede(null, st[2], st[0], null);
        
        Blok blok = new Blok(st[5]);
        int[][] razpored = new int[2][4];
        razpored[0][0] = 4;
        razpored[0][1] = 2;
        razpored[0][2] = 3;
        razpored[0][3] = 0;
        razpored[1][0] = 1;
        razpored[1][1] = 5;
        razpored[1][2] = 5;
        razpored[1][3] = -1;
        int[][] rezultat = blok.razporeditev();
        TestSkupno.preveri(Arrays.deepEquals(razpored, rezultat));
    }
}
