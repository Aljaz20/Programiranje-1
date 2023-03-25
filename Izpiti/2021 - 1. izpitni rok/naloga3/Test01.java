
public class Test01 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 691);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 576);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 349);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 28);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 8);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 788);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 790);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 757);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 152);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 702);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 471);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 375);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 234);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 629);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 871);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 109);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 198);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 479);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 50);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 486);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 91);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 970);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 420);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 371);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 155);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 524);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o23});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o23});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o1});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o18, o1, o12, o13});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o24});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o15, o22, o2, o6, o13, o8, o23});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o25, o9, o23, o6});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
        System.out.println(p6.zahtevnost());
    }
}
