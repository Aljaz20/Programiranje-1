
public class Test49 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[15];
        psi[0] = new Tretja.RodovniskiPes("ab", null, null);
        psi[1] = new Tretja.RodovniskiPes("ab", null, null);
        psi[2] = new Tretja.RodovniskiPes("ab", psi[1], psi[0]);
        psi[3] = new Tretja.RodovniskiPes("ab", null, null);
        psi[4] = new Tretja.RodovniskiPes("ab", psi[2], psi[3]);
        psi[5] = new Tretja.RodovniskiPes("ab", null, null);
        psi[6] = new Tretja.RodovniskiPes("ab", null, null);
        psi[7] = new Tretja.RodovniskiPes("ab", null, null);
        psi[8] = new Tretja.RodovniskiPes("ab", null, null);
        psi[9] = new Tretja.RodovniskiPes("ab", psi[4], psi[6]);
        psi[10] = new Tretja.RodovniskiPes("ab", null, null);
        psi[11] = new Tretja.RodovniskiPes("ab", psi[10], psi[9]);
        psi[12] = new Tretja.RodovniskiPes("babab", psi[8], psi[7]);
        psi[13] = new Tretja.RodovniskiPes("ab", psi[5], psi[11]);
        psi[14] = new Tretja.RodovniskiPes("ab", psi[13], psi[12]);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
