
public class Test47 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[17];
        psi[0] = new Tretja.RodovniskiPes("aba", null, null);
        psi[1] = new Tretja.RodovniskiPes("aba", null, null);
        psi[2] = new Tretja.RodovniskiPes("aaa", null, null);
        psi[3] = new Tretja.RodovniskiPes("aba", null, null);
        psi[4] = new Tretja.RodovniskiPes("aba", psi[1], psi[3]);
        psi[5] = new Tretja.RodovniskiPes("aba", null, null);
        psi[6] = new Tretja.RodovniskiPes("aba", null, null);
        psi[7] = new Tretja.RodovniskiPes("aba", null, null);
        psi[8] = new Tretja.RodovniskiPes("aba", psi[7], psi[5]);
        psi[9] = new Tretja.RodovniskiPes("aba", psi[2], psi[0]);
        psi[10] = new Tretja.RodovniskiPes("aba", null, null);
        psi[11] = new Tretja.RodovniskiPes("aba", null, null);
        psi[12] = new Tretja.RodovniskiPes("aba", null, null);
        psi[13] = new Tretja.RodovniskiPes("aaa", psi[8], psi[6]);
        psi[14] = new Tretja.RodovniskiPes("aba", psi[11], psi[13]);
        psi[15] = new Tretja.RodovniskiPes("aba", null, null);
        psi[16] = new Tretja.RodovniskiPes("aba", null, null);

        for (int i = 0;  i < psi.length;  i++) {
            System.out.printf("psi[%d] -> %b%n", i, psi[i].preveri());
        }
    }
}
