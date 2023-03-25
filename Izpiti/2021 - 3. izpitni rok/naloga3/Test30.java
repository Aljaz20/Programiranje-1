
public class Test30 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[32];
        zivali[0] = new Tretja.Pes();
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.Macka();
        zivali[3] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[4] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[5] = new Tretja.Pes();
        zivali[6] = new Tretja.Macka();
        zivali[7] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[8] = new Tretja.Pes();
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.Pes();
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[13] = new Tretja.Pes();
        zivali[14] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[15] = new Tretja.Macka();
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[18] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[19] = new Tretja.RodovniskiPes("ba", null, null);
        zivali[20] = new Tretja.Macka();
        zivali[21] = new Tretja.Macka();
        zivali[22] = new Tretja.Pes();
        zivali[23] = new Tretja.Pes();
        zivali[24] = new Tretja.Pes();
        zivali[25] = new Tretja.Pes();
        zivali[26] = new Tretja.Macka();
        zivali[27] = new Tretja.RodovniskiPes("bbb", null, null);
        zivali[28] = new Tretja.Macka();
        zivali[29] = new Tretja.Macka();
        zivali[30] = new Tretja.Pes();
        zivali[31] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
