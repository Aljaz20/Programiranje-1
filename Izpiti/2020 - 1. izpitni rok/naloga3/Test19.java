
public class Test19 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 9966, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 2087, v000);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 2056, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 1932, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 7355, v000);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 6223, null);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 2252, v005);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 2117, v004);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 6261, v006);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 4950, v005);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 7753, v004);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 9293, v005);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 4176, null);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 1697, v000);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 1852, v011);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 7387, v003);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 4060, null);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 1265, v009);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 1304, null);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 9489, v017);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 7567, v012);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 2402, v020);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 2805, null);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 8702, v004);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 3871, v008);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 8640, v009);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 9106, v003);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 9715, v002);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 8024, v009);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 4832, v026);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 4514, v025);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 4237, v030);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 2801, v010);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 8254, v024);
        Tretja.Vodja v034 = new Tretja.Vodja("v034", 9640, v025);
        Tretja.Vodja v035 = new Tretja.Vodja("v035", 4074, v010);
        Tretja.Vodja v036 = new Tretja.Vodja("v036", 6538, v003);
        Tretja.Vodja v037 = new Tretja.Vodja("v037", 9020, null);
        Tretja.Vodja v038 = new Tretja.Vodja("v038", 8252, null);
        Tretja.Vodja v039 = new Tretja.Vodja("v039", 8692, v017);
        Tretja.Vodja v040 = new Tretja.Vodja("v040", 6349, v028);
        Tretja.Vodja v041 = new Tretja.Vodja("v041", 6134, v001);
        Tretja.Vodja v042 = new Tretja.Vodja("v042", 3559, v020);
        Tretja.Vodja v043 = new Tretja.Vodja("v043", 9943, v017);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033, v034, v035, v036, v037, v038, v039, v040, v041, v042, v043};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
