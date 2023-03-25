
public class Test25 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[39];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.Macka();
        zivali[2] = new Tretja.Pes();
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Pes();
        zivali[5] = new Tretja.Macka();
        zivali[6] = new Tretja.Pes();
        zivali[7] = new Tretja.RodovniskiPes("baaa", null, null);
        zivali[8] = new Tretja.RodovniskiPes("bbaab", null, null);
        zivali[9] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.RodovniskiPes("bbaab", null, null);
        zivali[12] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[13] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[16] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[17] = new Tretja.Macka();
        zivali[18] = new Tretja.Pes();
        zivali[19] = new Tretja.Pes();
        zivali[20] = new Tretja.RodovniskiPes("baaa", null, null);
        zivali[21] = new Tretja.RodovniskiPes("bbaab", null, null);
        zivali[22] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[23] = new Tretja.RodovniskiPes("bbaab", null, null);
        zivali[24] = new Tretja.Pes();
        zivali[25] = new Tretja.Macka();
        zivali[26] = new Tretja.Pes();
        zivali[27] = new Tretja.Macka();
        zivali[28] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[29] = new Tretja.Macka();
        zivali[30] = new Tretja.RodovniskiPes("bbaab", null, null);
        zivali[31] = new Tretja.Pes();
        zivali[32] = new Tretja.Macka();
        zivali[33] = new Tretja.Macka();
        zivali[34] = new Tretja.RodovniskiPes("ab", null, null);
        zivali[35] = new Tretja.Pes();
        zivali[36] = new Tretja.Pes();
        zivali[37] = new Tretja.Macka();
        zivali[38] = new Tretja.Pes();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
