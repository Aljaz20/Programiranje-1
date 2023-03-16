
public class Test04 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[17];
        psi[0] = new Tretja.RodovniskiPes("ba", null, null);
        psi[1] = new Tretja.RodovniskiPes("babaa", null, null);
        psi[2] = new Tretja.RodovniskiPes("abaab", null, null);
        psi[3] = new Tretja.RodovniskiPes("ba", null, null);
        psi[4] = new Tretja.RodovniskiPes("aaa", null, null);
        psi[5] = new Tretja.RodovniskiPes("bab", null, null);
        psi[6] = new Tretja.RodovniskiPes("abaab", null, null);
        psi[7] = new Tretja.RodovniskiPes("aaa", null, null);
        psi[8] = new Tretja.RodovniskiPes("babaa", null, null);
        psi[9] = new Tretja.RodovniskiPes("bab", null, null);
        psi[10] = new Tretja.RodovniskiPes("ba", null, null);
        psi[11] = new Tretja.RodovniskiPes("babaa", null, null);
        psi[12] = new Tretja.RodovniskiPes("bab", null, null);
        psi[13] = new Tretja.RodovniskiPes("bab", null, null);
        psi[14] = new Tretja.RodovniskiPes("bab", null, null);
        psi[15] = new Tretja.RodovniskiPes("abaab", null, null);
        psi[16] = new Tretja.RodovniskiPes("abaab", null, null);

        System.out.println(Tretja.prestej(psi, "ba"));
        System.out.println(Tretja.prestej(psi, "bab"));
        System.out.println(Tretja.prestej(psi, "abaab"));
        System.out.println(Tretja.prestej(psi, "aaa"));
        System.out.println(Tretja.prestej(psi, "babaa"));
    }
}
