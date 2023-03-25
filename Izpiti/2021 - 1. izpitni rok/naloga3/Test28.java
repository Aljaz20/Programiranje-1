
public class Test28 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 16);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 371);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 112);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 370);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 243);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 320);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 176);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 384);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 28);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 224);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 152);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 53);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 109);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 343);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 422);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 445);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 61);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 211);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 221);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 46);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 328);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 275);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o16, o6});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o7});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o19});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o21, o13});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o5, o2});

        Tretja.Delavnica delavnica = new Tretja.Delavnica(new Tretja.Delavec[]{
            new Tretja.Delavec("Matija Furlan", 838),
            new Tretja.Delavec("Emil Golob", 604),
            new Tretja.Delavec("Darja Klasinc", 587),
            new Tretja.Delavec("Vesna Mihevc", 813),
            new Tretja.Delavec("Janez Han", 781),
            new Tretja.Delavec("Franci Urlep", 639),
            new Tretja.Delavec("Peter Zorman", 612),
            new Tretja.Delavec("Darja Golob", 795),
            new Tretja.Delavec("Matija Urlep", 452),
            new Tretja.Delavec("Sonja Klasinc", 693),
            new Tretja.Delavec("Karel Urlep", 265),
            new Tretja.Delavec("Bojan Ivnik", 470),
            new Tretja.Delavec("Tanja Bevk", 479),
            new Tretja.Delavec("Andrej Oblak", 579),
            new Tretja.Delavec("Roman Novak", 203),
            new Tretja.Delavec("Janez Cevc", 938),
            new Tretja.Delavec("Nina Cevc", 129),
            new Tretja.Delavec("Peter Ermenc", 83),
            new Tretja.Delavec("Olga Cevc", 336),
            new Tretja.Delavec("Zoran Pirc", 483),
            new Tretja.Delavec("Iva Han", 974),
            new Tretja.Delavec("Cvetka Ravnikar", 690),
            new Tretja.Delavec("Ula Urlep", 340),
            new Tretja.Delavec("Hinko Klasinc", 913),
            new Tretja.Delavec("Hilda Urlep", 996),
            new Tretja.Delavec("Urban Bevk", 627),
            new Tretja.Delavec("Cene Antolin", 282),
            new Tretja.Delavec("Tilen Vidic", 479),
            new Tretja.Delavec("Karel Mihevc", 201),
            new Tretja.Delavec("Hilda Mihevc", 469),
        });

        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p2}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p3, p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p1, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4, p3}));
        System.out.println(delavnica.univerzalci(new Tretja.Projekt[]{p4}));
    }
}
