
public class Test21 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[38];
        zivali[0] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[1] = new Tretja.Macka();
        zivali[2] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[3] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.Macka();
        zivali[7] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[8] = new Tretja.RodovniskiPes("bbbab", null, null);
        zivali[9] = new Tretja.Macka();
        zivali[10] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[11] = new Tretja.RodovniskiPes("bbbab", null, null);
        zivali[12] = new Tretja.Macka();
        zivali[13] = new Tretja.Pes();
        zivali[14] = new Tretja.Pes();
        zivali[15] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[18] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.Pes();
        zivali[21] = new Tretja.Macka();
        zivali[22] = new Tretja.Macka();
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.Pes();
        zivali[25] = new Tretja.RodovniskiPes("bbbab", null, null);
        zivali[26] = new Tretja.Macka();
        zivali[27] = new Tretja.Pes();
        zivali[28] = new Tretja.RodovniskiPes("bbbab", null, null);
        zivali[29] = new Tretja.RodovniskiPes("babaa", null, null);
        zivali[30] = new Tretja.Macka();
        zivali[31] = new Tretja.RodovniskiPes("bbbab", null, null);
        zivali[32] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[33] = new Tretja.Pes();
        zivali[34] = new Tretja.Pes();
        zivali[35] = new Tretja.Pes();
        zivali[36] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[37] = new Tretja.RodovniskiPes("bbbab", null, null);

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
