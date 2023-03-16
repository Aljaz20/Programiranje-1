
public class Test23 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[14];
        zivali[0] = new Tretja.RodovniskiPes("aabaa", null, null);
        zivali[1] = new Tretja.Macka();
        zivali[2] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[7] = new Tretja.RodovniskiPes("baab", null, null);
        zivali[8] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.RodovniskiPes("aabaa", null, null);
        zivali[11] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[12] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[13] = new Tretja.RodovniskiPes("bab", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
