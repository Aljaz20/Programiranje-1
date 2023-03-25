
public class Test17 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 455);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 382);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 488);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 228);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 573);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 724);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 830);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 287);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 672);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 378);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 227);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 967);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 249);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 46);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 822);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 493);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 55);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 88);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 374);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o16, o8, o18, o5, o15, o0});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o12, o13, o16});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o7, o18, o14, o12});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o16, o9, o1, o15});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o4, o15, o13, o16, o9});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o18, o9});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o6, o3});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o17});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o7, o9, o8, o15, o14});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o5, o8, o0, o7, o16});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o18, o6});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o12, o4, o3, o18});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o13, o2, o1, o6});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o7, o3, o18, o8, o10, o16});

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
