
public class Test06 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 457);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 645);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 942);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 811);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 585);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 99);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 997);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 65);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 11);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 151);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 449);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 537);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 329);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 318);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 893);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 354);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 832);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 859);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 24);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 454);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 681);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 1000);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 589);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 984);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 835);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 742);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 240);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 32);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 310);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 803);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 975);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 653);
        Tretja.Opravilo o32 = new Tretja.Opravilo("o32", 652);
        Tretja.Opravilo o33 = new Tretja.Opravilo("o33", 258);
        Tretja.Opravilo o34 = new Tretja.Opravilo("o34", 292);
        Tretja.Opravilo o35 = new Tretja.Opravilo("o35", 135);
        Tretja.Opravilo o36 = new Tretja.Opravilo("o36", 398);
        Tretja.Opravilo o37 = new Tretja.Opravilo("o37", 387);
        Tretja.Opravilo o38 = new Tretja.Opravilo("o38", 408);
        Tretja.Opravilo o39 = new Tretja.Opravilo("o39", 381);
        Tretja.Opravilo o40 = new Tretja.Opravilo("o40", 564);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o11, o17, o40, o20, o8, o29, o32, o14, o12, o34, o25, o16});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o14, o26});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o22});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o5, o7, o37, o2, o27, o12, o19, o0, o28, o24, o31, o29});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o37, o6, o18, o40});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o6, o15, o10, o9, o1, o29, o39, o33, o3});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o26, o40, o22, o9, o20});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o21});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o29, o17, o8, o19, o40, o36, o6, o13});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o31, o5, o35, o0, o3, o26});

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
    }
}
