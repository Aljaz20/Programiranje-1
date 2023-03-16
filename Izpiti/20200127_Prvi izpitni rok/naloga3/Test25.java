
public class Test25 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 3242, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 6887, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 9209, null);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 4106, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 2843, v002);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 6710, v000);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 9150, v000);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 3895, null);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 2684, v007);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 8834, v006);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 5003, v003);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 9117, v001);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 4014, v009);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 7036, v004);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 6300, v006);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 9374, null);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 7606, v011);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 6177, v009);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 6620, v001);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 9121, v008);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 2043, v018);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 5514, v003);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 2555, v000);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 5571, v000);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 1922, v020);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 9481, v001);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 6267, v009);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 2590, v016);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 5124, v024);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 5073, v001);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 8672, v007);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 1987, v026);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 3732, v029);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 1532, v021);
        Tretja.Vodja v034 = new Tretja.Vodja("v034", 8474, v007);
        Tretja.Vodja v035 = new Tretja.Vodja("v035", 7240, v032);
        Tretja.Vodja v036 = new Tretja.Vodja("v036", 4028, v003);
        Tretja.Vodja v037 = new Tretja.Vodja("v037", 7278, v003);
        Tretja.Vodja v038 = new Tretja.Vodja("v038", 3702, v028);
        Tretja.Vodja v039 = new Tretja.Vodja("v039", 2861, v006);
        Tretja.Vodja v040 = new Tretja.Vodja("v040", 3422, v037);
        Tretja.Vodja v041 = new Tretja.Vodja("v041", 6134, v001);
        Tretja.Vodja v042 = new Tretja.Vodja("v042", 3052, v034);
        Tretja.Vodja v043 = new Tretja.Vodja("v043", 7362, v015);
        Tretja.Vodja v044 = new Tretja.Vodja("v044", 8948, v027);
        Tretja.Vodja v045 = new Tretja.Vodja("v045", 4333, v017);
        Tretja.Vodja v046 = new Tretja.Vodja("v046", 7117, v005);
        Tretja.Vodja v047 = new Tretja.Vodja("v047", 2870, null);
        Tretja.Vodja v048 = new Tretja.Vodja("v048", 2079, v034);
        Tretja.Vodja v049 = new Tretja.Vodja("v049", 7604, null);
        Tretja.Vodja v050 = new Tretja.Vodja("v050", 6767, v014);
        Tretja.Vodja v051 = new Tretja.Vodja("v051", 4813, v006);
        Tretja.Vodja v052 = new Tretja.Vodja("v052", 1367, v009);
        Tretja.Vodja v053 = new Tretja.Vodja("v053", 5750, v052);
        Tretja.Vodja v054 = new Tretja.Vodja("v054", 5801, v015);
        Tretja.Vodja v055 = new Tretja.Vodja("v055", 1472, v041);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033, v034, v035, v036, v037, v038, v039, v040, v041, v042, v043, v044, v045, v046, v047, v048, v049, v050, v051, v052, v053, v054, v055};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
