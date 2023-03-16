
public class Test07 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 482);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 38);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 867);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 388);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 291);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 484);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 666);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 148);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 726);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 143);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 827);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 730);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 153);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 417);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 448);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 549);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 992);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 190);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 131);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 366);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 123);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 352);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 660);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 59);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 200);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 117);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 861);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 717);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 957);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 759);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 735);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o11, o6});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o27, o10, o0, o8, o25, o20, o23, o30, o7});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o0, o29, o15, o3});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o2, o9, o27, o3, o8, o20});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o26, o7, o3, o10});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o24, o2, o28, o14, o23, o16, o30, o1, o29, o22});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o30, o23, o17, o7});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o22});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o20, o30, o7, o22, o9, o15, o5, o4, o29, o25});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o15, o25});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o28, o14, o30, o4, o3});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o2, o23, o27});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o8, o6, o15, o23});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
        System.out.println(p6.zahtevnost());
        System.out.println(p7.zahtevnost());
        System.out.println(p8.zahtevnost());
        System.out.println(p9.zahtevnost());
        System.out.println(p10.zahtevnost());
        System.out.println(p11.zahtevnost());
        System.out.println(p12.zahtevnost());
    }
}
