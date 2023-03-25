
public class Test03 {

    public static void main(String[] args) {
        Tretja.RodovniskiPes[] psi = new Tretja.RodovniskiPes[16];
        psi[0] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[1] = new Tretja.RodovniskiPes("bba", null, null);
        psi[2] = new Tretja.RodovniskiPes("bba", null, null);
        psi[3] = new Tretja.RodovniskiPes("ab", null, null);
        psi[4] = new Tretja.RodovniskiPes("ab", null, null);
        psi[5] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[6] = new Tretja.RodovniskiPes("bba", null, null);
        psi[7] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[8] = new Tretja.RodovniskiPes("ab", null, null);
        psi[9] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[10] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[11] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[12] = new Tretja.RodovniskiPes("aabb", null, null);
        psi[13] = new Tretja.RodovniskiPes("ab", null, null);
        psi[14] = new Tretja.RodovniskiPes("abbba", null, null);
        psi[15] = new Tretja.RodovniskiPes("abbba", null, null);

        System.out.println(Tretja.prestej(psi, "abbba"));
        System.out.println(Tretja.prestej(psi, "bba"));
        System.out.println(Tretja.prestej(psi, "aabb"));
        System.out.println(Tretja.prestej(psi, "ab"));
    }
}
