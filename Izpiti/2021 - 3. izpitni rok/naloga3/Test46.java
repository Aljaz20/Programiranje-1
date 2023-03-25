
public class Test46 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[18];
        psi[0] = new Tretja.RodovniskiPes("baab", null, null);
        psi[1] = new Tretja.RodovniskiPes("babba", null, null);
        psi[2] = new Tretja.RodovniskiPes("babba", psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes("babba", null, null);
        psi[4] = new Tretja.RodovniskiPes("babba", null, null);
        psi[5] = new Tretja.RodovniskiPes("babba", null, null);
        psi[6] = new Tretja.RodovniskiPes("babba", psi[5], psi[4]);
        psi[7] = new Tretja.RodovniskiPes("babba", psi[3], psi[6]);
        psi[8] = new Tretja.RodovniskiPes("baab", psi[2], psi[7]);
        psi[9] = new Tretja.RodovniskiPes("babba", null, null);
        psi[10] = new Tretja.RodovniskiPes("babba", psi[9], psi[8]);
        psi[11] = new Tretja.RodovniskiPes("baab", null, null);
        psi[12] = new Tretja.RodovniskiPes("babba", psi[10], psi[11]);
        psi[13] = new Tretja.RodovniskiPes("babba", null, null);
        psi[14] = new Tretja.RodovniskiPes("babba", psi[13], psi[12]);
        psi[15] = new Tretja.RodovniskiPes("babba", null, null);
        psi[16] = new Tretja.RodovniskiPes("babba", psi[15], psi[14]);
        psi[17] = new Tretja.RodovniskiPes("babba", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
