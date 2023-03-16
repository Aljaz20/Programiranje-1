
public class Test02 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 571);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 875);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 644);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 666);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 992);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 216);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 560);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 960);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 379);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 671);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 98);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 537);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 529);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o2, o11});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o10, o5});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o6});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o4});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o10, o12, o11});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o7, o10, o4});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o2, o11, o6, o0});

        System.out.println(p0.zahtevnost());
        System.out.println(p1.zahtevnost());
        System.out.println(p2.zahtevnost());
        System.out.println(p3.zahtevnost());
        System.out.println(p4.zahtevnost());
        System.out.println(p5.zahtevnost());
        System.out.println(p6.zahtevnost());
        System.out.println(p7.zahtevnost());
    }
}
