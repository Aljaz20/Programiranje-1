
public class Test32 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 220);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 9);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 125);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 401);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 306);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 62);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 209);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 256);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 137);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 81);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 463);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 479);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 265);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o11});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o9, o0});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o1});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o5, o11});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o6, o7});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Janez Ermenc", 956),
            new Tretja.Delavec("Andrej Ivnik", 69),
            new Tretja.Delavec("Urban Mihevc", 669),
            new Tretja.Delavec("Karel Oblak", 36),
            new Tretja.Delavec("Cvetka Ermenc", 297),
            new Tretja.Delavec("Karla Klasinc", 289),
            new Tretja.Delavec("Zinka Urlep", 825),
            new Tretja.Delavec("Zinka Furlan", 877),
            new Tretja.Delavec("Karla Pirc", 758),
            new Tretja.Delavec("Vesna Oblak", 376),
            new Tretja.Delavec("Janez Zorman", 315),
            new Tretja.Delavec("Jana Novak", 605),
            new Tretja.Delavec("Bojan Sovinc", 850),
            new Tretja.Delavec("Lara Vidic", 648),
            new Tretja.Delavec("Hinko Bevk", 195),
            new Tretja.Delavec("Hinko Han", 760),
            new Tretja.Delavec("Nace Jerman", 324),
            new Tretja.Delavec("Franci Golob", 867),
            new Tretja.Delavec("Hilda Ivnik", 797),
            new Tretja.Delavec("Franci Klasinc", 627),
            new Tretja.Delavec("Gabrijela Klasinc", 427),
            new Tretja.Delavec("Bojan Bevk", 203),
            new Tretja.Delavec("Francka Klasinc", 480),
            new Tretja.Delavec("Emil Jerman", 29),
            new Tretja.Delavec("Maja Tanko", 307),
            new Tretja.Delavec("Andrej Debeljak", 129),
            new Tretja.Delavec("Nina Debeljak", 751),
            new Tretja.Delavec("Ivan Novak", 718),
            new Tretja.Delavec("Oton Urlep", 35),
            new Tretja.Delavec("Tanja Urlep", 904),
            new Tretja.Delavec("Olga Ravnikar", 220),
            new Tretja.Delavec("Tilen Debeljak", 815),
            new Tretja.Delavec("Sonja Oblak", 931),
            new Tretja.Delavec("Gabrijela Bevk", 701),
            new Tretja.Delavec("Cene Antolin", 794),
            new Tretja.Delavec("Francka Zorman", 395),
            new Tretja.Delavec("Darja Golob", 240),
            new Tretja.Delavec("Eva Ravnikar", 817),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p0}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p0, p1}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p5, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p2, p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p5, p3, p2}));
    }
}
