
public class Test33 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 12);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 214);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 439);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 386);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 362);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 42);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 57);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 237);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 274);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 390);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 406);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 387);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 60);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 60);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o8, o10});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o0});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o3});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o9});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o8});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o0, o7});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Nace Antolin", 247),
            new Tretja.Delavec("Petra Antolin", 455),
            new Tretja.Delavec("Emil Ravnikar", 26),
            new Tretja.Delavec("Zoran Jerman", 619),
            new Tretja.Delavec("Bojan Mihevc", 857),
            new Tretja.Delavec("Jana Pirc", 465),
            new Tretja.Delavec("Petra Bevk", 445),
            new Tretja.Delavec("Tanja Golob", 250),
            new Tretja.Delavec("Nina Zorman", 608),
            new Tretja.Delavec("Nina Zorman", 668),
            new Tretja.Delavec("Olga Ermenc", 768),
            new Tretja.Delavec("Lara Golob", 497),
            new Tretja.Delavec("Karla Urlep", 997),
            new Tretja.Delavec("Gregor Pirc", 199),
            new Tretja.Delavec("Sonja Tanko", 42),
            new Tretja.Delavec("Hilda Zorman", 965),
            new Tretja.Delavec("Roman Vidic", 787),
            new Tretja.Delavec("Vesna Ivnik", 205),
            new Tretja.Delavec("Gabrijela Furlan", 821),
            new Tretja.Delavec("Romana Urlep", 229),
            new Tretja.Delavec("Olga Urlep", 27),
            new Tretja.Delavec("Roman Urlep", 370),
            new Tretja.Delavec("Sonja Ravnikar", 358),
            new Tretja.Delavec("Dejan Sovinc", 359),
            new Tretja.Delavec("Iva Furlan", 203),
            new Tretja.Delavec("Olga Urlep", 614),
            new Tretja.Delavec("Sonja Cevc", 241),
            new Tretja.Delavec("Vinko Cevc", 259),
            new Tretja.Delavec("Eva Cevc", 180),
            new Tretja.Delavec("Tilen Ravnikar", 90),
            new Tretja.Delavec("Andrej Sovinc", 451),
            new Tretja.Delavec("Matija Han", 10),
            new Tretja.Delavec("Darja Antolin", 22),
            new Tretja.Delavec("Dejan Antolin", 310),
            new Tretja.Delavec("Darja Bevk", 283),
            new Tretja.Delavec("Darja Ivnik", 314),
            new Tretja.Delavec("Tilen Tanko", 372),
            new Tretja.Delavec("Zinka Cevc", 186),
            new Tretja.Delavec("Romana Lipnik", 817),
            new Tretja.Delavec("Zinka Furlan", 313),
            new Tretja.Delavec("Tilen Furlan", 742),
            new Tretja.Delavec("Iva Tanko", 570),
            new Tretja.Delavec("Ivan Furlan", 227),
            new Tretja.Delavec("Jana Vidic", 344),
            new Tretja.Delavec("Urban Lipnik", 657),
            new Tretja.Delavec("Petra Pirc", 825),
            new Tretja.Delavec("Franci Pirc", 335),
            new Tretja.Delavec("Janez Cevc", 842),
            new Tretja.Delavec("Maja Ravnikar", 895),
            new Tretja.Delavec("Zoran Han", 681),
            new Tretja.Delavec("Darja Vidic", 744),
            new Tretja.Delavec("Ivan Sovinc", 649),
            new Tretja.Delavec("Lara Pirc", 262),
            new Tretja.Delavec("Vinko Bevk", 692),
            new Tretja.Delavec("Karel Pirc", 840),
            new Tretja.Delavec("Sonja Urlep", 578),
            new Tretja.Delavec("Nina Tanko", 251),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p3, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p3, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p3, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5, p1, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p0, p1}));
    }
}
