
public class Test10 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 135);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 234);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 656);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 765);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 171);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 848);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 613);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 810);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 584);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 714);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 659);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 969);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 287);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 178);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 147);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 82);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 353);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 280);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 524);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 628);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 597);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o7});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o19, o18});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o11, o19, o17, o6, o13});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o3, o9, o10, o13});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o19, o13, o3});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
    }
}
