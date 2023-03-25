
public class Test32 {

    public static void main(String[] args) {
        Tretja.Zival[] zivali = new Tretja.Zival[19];
        zivali[0] = new Tretja.Macka();
        zivali[1] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[2] = new Tretja.Pes();
        zivali[3] = new Tretja.Pes();
        zivali[4] = new Tretja.Macka();
        zivali[5] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[6] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[7] = new Tretja.Macka();
        zivali[8] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[9] = new Tretja.Pes();
        zivali[10] = new Tretja.Pes();
        zivali[11] = new Tretja.Pes();
        zivali[12] = new Tretja.RodovniskiPes("aaaa", null, null);
        zivali[13] = new Tretja.RodovniskiPes("bb", null, null);
        zivali[14] = new Tretja.Macka();
        zivali[15] = new Tretja.Pes();
        zivali[16] = new Tretja.RodovniskiPes("aaaa", null, null);
        zivali[17] = new Tretja.RodovniskiPes("babba", null, null);
        zivali[18] = new Tretja.Macka();

        koncert(zivali);
    }

    public static void koncert(Tretja.Zival[] zivali) {
        for (Tretja.Zival zival: zivali) {
            System.out.println(zival.oglasiSe());
        }
    }
}
