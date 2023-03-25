
public class Test34 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[24];
        zivali[0] = new Tretja.Macka();
        zivali[1] = new Tretja.Pes();
        zivali[2] = new Tretja.RodovniskiPes("baa", null, null);
        zivali[3] = new Tretja.Macka();
        zivali[4] = new Tretja.Macka();
        zivali[5] = new Tretja.Macka();
        zivali[6] = new Tretja.Pes();
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.RodovniskiPes("baa", null, null);
        zivali[9] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[10] = new Tretja.Macka();
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.RodovniskiPes("bab", null, null);
        zivali[13] = new Tretja.Pes();
        zivali[14] = new Tretja.RodovniskiPes("baa", null, null);
        zivali[15] = new Tretja.Macka();
        zivali[16] = new Tretja.Pes();
        zivali[17] = new Tretja.Macka();
        zivali[18] = new Tretja.Macka();
        zivali[19] = new Tretja.Macka();
        zivali[20] = new Tretja.Macka();
        zivali[21] = new Tretja.Macka();
        zivali[22] = new Tretja.Macka();
        zivali[23] = new Tretja.Pes();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
