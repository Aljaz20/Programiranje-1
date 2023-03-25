
public class Test50 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[15];
        psi[0] = new Tretja.RodovniskiPes("babb", null, null);
        psi[1] = new Tretja.RodovniskiPes("babb", null, null);
        psi[2] = new Tretja.RodovniskiPes("ab", psi[0], psi[1]);
        psi[3] = new Tretja.RodovniskiPes("ab", null, null);
        psi[4] = new Tretja.RodovniskiPes("ab", null, null);
        psi[5] = new Tretja.RodovniskiPes("ab", psi[3], psi[2]);
        psi[6] = new Tretja.RodovniskiPes("ab", psi[5], psi[4]);
        psi[7] = new Tretja.RodovniskiPes("ab", null, null);
        psi[8] = new Tretja.RodovniskiPes("ab", psi[7], psi[6]);
        psi[9] = new Tretja.RodovniskiPes("ab", null, null);
        psi[10] = new Tretja.RodovniskiPes("ab", psi[8], psi[9]);
        psi[11] = new Tretja.RodovniskiPes("ab", null, null);
        psi[12] = new Tretja.RodovniskiPes("ab", null, null);
        psi[13] = new Tretja.RodovniskiPes("ab", null, null);
        psi[14] = new Tretja.RodovniskiPes("babb", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
