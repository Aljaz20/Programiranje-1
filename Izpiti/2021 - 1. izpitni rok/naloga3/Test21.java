
public class Test21 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 229);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 315);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 169);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 380);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 407);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 404);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 438);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 52);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 264);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 304);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 131);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 187);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 321);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 47);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 349);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o8, o13, o9});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o10, o3});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o8, o7, o0});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o14, o7, o13});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o2, o10});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Vesna Lipnik", 192),
            new Tretja.Delavec("Tanja Zorman", 950),
            new Tretja.Delavec("Branka Antolin", 801),
            new Tretja.Delavec("Branka Lipnik", 778),
            new Tretja.Delavec("Darja Novak", 438),
            new Tretja.Delavec("Zinka Sovinc", 607),
            new Tretja.Delavec("Tanja Furlan", 924),
            new Tretja.Delavec("Sonja Tanko", 213),
            new Tretja.Delavec("Emil Pirc", 981),
            new Tretja.Delavec("Hinko Antolin", 76),
            new Tretja.Delavec("Andrej Sovinc", 5),
            new Tretja.Delavec("Peter Jerman", 709),
            new Tretja.Delavec("Vinko Ermenc", 850),
            new Tretja.Delavec("Nace Urlep", 731),
            new Tretja.Delavec("Nace Ravnikar", 986),
            new Tretja.Delavec("Dejan Sovinc", 503),
            new Tretja.Delavec("Cvetka Klasinc", 389),
            new Tretja.Delavec("Simon Klasinc", 354),
            new Tretja.Delavec("Andrej Ermenc", 126),
            new Tretja.Delavec("Ivan Golob", 699),
            new Tretja.Delavec("Emil Vidic", 538),
            new Tretja.Delavec("Iva Debeljak", 595),
            new Tretja.Delavec("Simon Vidic", 134),
            new Tretja.Delavec("Francka Bevk", 564),
            new Tretja.Delavec("Simon Novak", 311),
            new Tretja.Delavec("Olga Han", 143),
            new Tretja.Delavec("Romana Antolin", 333),
            new Tretja.Delavec("Tilen Zorman", 964),
            new Tretja.Delavec("Olga Lipnik", 329),
            new Tretja.Delavec("Hinko Bevk", 162),
            new Tretja.Delavec("Zoran Antolin", 417),
            new Tretja.Delavec("Roman Furlan", 512),
            new Tretja.Delavec("Tanja Zorman", 433),
            new Tretja.Delavec("Gregor Lipnik", 555),
            new Tretja.Delavec("Andrej Lipnik", 468),
            new Tretja.Delavec("Tilen Jerman", 137),
            new Tretja.Delavec("Bojan Ravnikar", 62),
            new Tretja.Delavec("Maja Furlan", 650),
            new Tretja.Delavec("Ula Furlan", 766),
            new Tretja.Delavec("Roman Sovinc", 440),
            new Tretja.Delavec("Lara Lipnik", 342),
            new Tretja.Delavec("Emil Mihevc", 789),
            new Tretja.Delavec("Tilen Antolin", 811),
            new Tretja.Delavec("Zinka Tanko", 795),
            new Tretja.Delavec("Urban Han", 172),
            new Tretja.Delavec("Vesna Ivnik", 113),
            new Tretja.Delavec("Tanja Ravnikar", 374),
            new Tretja.Delavec("Ivan Oblak", 848),
            new Tretja.Delavec("Vesna Ivnik", 315),
            new Tretja.Delavec("Ula Vidic", 364),
            new Tretja.Delavec("Leon Ivnik", 304),
            new Tretja.Delavec("Cene Jerman", 346),
            new Tretja.Delavec("Roman Bevk", 85),
            new Tretja.Delavec("Nace Pirc", 895),
            new Tretja.Delavec("Leon Mihevc", 250),
            new Tretja.Delavec("Ana Tanko", 401),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p4}));
    }
}
