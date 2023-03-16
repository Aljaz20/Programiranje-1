
public class Test08 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 891);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 566);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 650);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 215);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 96);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 748);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 603);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 92);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 159);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 460);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 647);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 34);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 40);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 241);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 603);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 680);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 405);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 882);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 384);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 507);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 131);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 15);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 49);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 208);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 543);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 789);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 517);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 778);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 579);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 115);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 457);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 198);
        Tretja.Opravilo o32 = new Tretja.Opravilo("o32", 223);
        Tretja.Opravilo o33 = new Tretja.Opravilo("o33", 779);
        Tretja.Opravilo o34 = new Tretja.Opravilo("o34", 88);
        Tretja.Opravilo o35 = new Tretja.Opravilo("o35", 944);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o4, o26, o3});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o16, o7, o21, o9, o29});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o0, o1, o17, o31, o27});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o31, o15, o11, o22, o14, o19, o20, o17, o33, o6});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o22, o26, o24, o28, o6, o25, o18});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o22, o35, o9, o34, o1, o28, o27, o15, o4, o32});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o25, o16, o2, o8, o10, o3, o17, o22});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o30, o32, o27, o17});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o12, o6});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o34, o32, o27, o26, o1, o35, o18, o13, o10, o15, o9, o29});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o8, o32, o13, o19, o21, o14, o22, o23});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o17, o20, o9});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o16, o27, o35, o11, o30});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o12, o1});

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
        System.out.println(p13.zahtevnost());
    }
}
