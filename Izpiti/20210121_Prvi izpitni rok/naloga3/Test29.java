
public class Test29 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 418);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 394);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 457);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 154);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 127);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 300);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 66);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 107);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 299);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 426);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 476);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 57);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 272);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 74);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 384);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 404);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 324);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 20);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 470);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 142);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o8, o5, o2});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o3, o11});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o19, o11, o13, o6});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o7, o4, o10, o1});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o10, o12});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o12, o13});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o3, o0});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o19, o15});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o3, o10, o11, o13});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o6, o18, o0, o12});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o0});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o5, o1, o8, o7});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o19, o10});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o9, o3, o18});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Franci Ravnikar", 633),
            new Tretja.Delavec("Emil Sovinc", 497),
            new Tretja.Delavec("Roman Vidic", 553),
            new Tretja.Delavec("Tilen Cevc", 429),
            new Tretja.Delavec("Branka Zorman", 263),
            new Tretja.Delavec("Darja Han", 566),
            new Tretja.Delavec("Vesna Ravnikar", 237),
            new Tretja.Delavec("Cvetka Ivnik", 152),
            new Tretja.Delavec("Janez Tanko", 720),
            new Tretja.Delavec("Dejan Cevc", 271),
            new Tretja.Delavec("Darja Tanko", 51),
            new Tretja.Delavec("Tanja Ravnikar", 957),
            new Tretja.Delavec("Tilen Ermenc", 470),
            new Tretja.Delavec("Vinko Vidic", 438),
            new Tretja.Delavec("Roman Vidic", 204),
            new Tretja.Delavec("Leon Golob", 796),
            new Tretja.Delavec("Ana Mihevc", 848),
            new Tretja.Delavec("Francka Novak", 62),
            new Tretja.Delavec("Bojan Tanko", 867),
            new Tretja.Delavec("Oton Furlan", 362),
            new Tretja.Delavec("Tilen Vidic", 867),
            new Tretja.Delavec("Peter Pirc", 927),
            new Tretja.Delavec("Roman Jerman", 996),
            new Tretja.Delavec("Matija Mihevc", 845),
            new Tretja.Delavec("Gabrijela Vidic", 624),
            new Tretja.Delavec("Peter Tanko", 686),
            new Tretja.Delavec("Maja Klasinc", 816),
            new Tretja.Delavec("Ula Klasinc", 385),
            new Tretja.Delavec("Gregor Antolin", 401),
            new Tretja.Delavec("Dejan Novak", 778),
            new Tretja.Delavec("Tilen Ermenc", 398),
            new Tretja.Delavec("Franci Mihevc", 995),
            new Tretja.Delavec("Vesna Han", 900),
            new Tretja.Delavec("Darja Urlep", 23),
            new Tretja.Delavec("Zoran Ivnik", 492),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p12, p0, p14}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p14}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p12}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p11, p2, p7, p12, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p8, p13}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p10, p14, p9, p0, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p10, p7, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p7}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p12, p14, p2, p6, p13}));
    }
}
