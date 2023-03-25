
public class Test05 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 152);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 888);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 609);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 600);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 976);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 179);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 479);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 811);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 146);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 160);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 638);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 252);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 621);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 748);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 210);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 584);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 273);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 749);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 734);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 406);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 538);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 661);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 137);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o19, o22, o20, o18});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o21, o2, o16});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o10, o7, o1});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o14, o10, o1, o22, o4, o15, o21});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o0});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o4});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o19, o5});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o16, o15, o18, o9});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o18, o20, o15});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o7, o5, o22, o11, o19});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o22, o1, o6, o7, o17, o11, o12});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o20, o18, o6, o21});

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
    }
}
