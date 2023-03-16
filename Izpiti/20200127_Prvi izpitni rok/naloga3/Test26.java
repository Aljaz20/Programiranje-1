
public class Test26 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 1635, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 9085, v000);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 9601, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 7485, v002);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 9488, v001);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 6525, v002);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 6599, v004);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 6651, v002);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 5185, v007);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 3354, v007);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 9384, v000);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 8070, v001);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 3334, null);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 3628, v012);
        Tretja.Vodja v014 = new Tretja.Vodja("v014", 9805, v007);
        Tretja.Vodja v015 = new Tretja.Vodja("v015", 6680, v009);
        Tretja.Vodja v016 = new Tretja.Vodja("v016", 9303, v005);
        Tretja.Vodja v017 = new Tretja.Vodja("v017", 3151, v008);
        Tretja.Vodja v018 = new Tretja.Vodja("v018", 9751, v017);
        Tretja.Vodja v019 = new Tretja.Vodja("v019", 6211, null);
        Tretja.Vodja v020 = new Tretja.Vodja("v020", 8922, null);
        Tretja.Vodja v021 = new Tretja.Vodja("v021", 8563, v014);
        Tretja.Vodja v022 = new Tretja.Vodja("v022", 4342, null);
        Tretja.Vodja v023 = new Tretja.Vodja("v023", 3129, v007);
        Tretja.Vodja v024 = new Tretja.Vodja("v024", 9994, v020);
        Tretja.Vodja v025 = new Tretja.Vodja("v025", 4045, null);
        Tretja.Vodja v026 = new Tretja.Vodja("v026", 7390, v000);
        Tretja.Vodja v027 = new Tretja.Vodja("v027", 6940, v003);
        Tretja.Vodja v028 = new Tretja.Vodja("v028", 4509, v019);
        Tretja.Vodja v029 = new Tretja.Vodja("v029", 6248, null);
        Tretja.Vodja v030 = new Tretja.Vodja("v030", 4534, v005);
        Tretja.Vodja v031 = new Tretja.Vodja("v031", 3451, v019);
        Tretja.Vodja v032 = new Tretja.Vodja("v032", 8509, v011);
        Tretja.Vodja v033 = new Tretja.Vodja("v033", 4281, v005);
        Tretja.Vodja v034 = new Tretja.Vodja("v034", 5972, v005);
        Tretja.Vodja v035 = new Tretja.Vodja("v035", 1904, v013);
        Tretja.Vodja v036 = new Tretja.Vodja("v036", 1668, v001);
        Tretja.Vodja v037 = new Tretja.Vodja("v037", 7434, v006);
        Tretja.Vodja v038 = new Tretja.Vodja("v038", 8929, v029);
        Tretja.Vodja v039 = new Tretja.Vodja("v039", 6683, v018);
        Tretja.Vodja v040 = new Tretja.Vodja("v040", 5711, v027);
        Tretja.Vodja v041 = new Tretja.Vodja("v041", 1012, v026);
        Tretja.Vodja v042 = new Tretja.Vodja("v042", 1127, v040);
        Tretja.Vodja v043 = new Tretja.Vodja("v043", 4783, v025);
        Tretja.Vodja v044 = new Tretja.Vodja("v044", 3978, v008);
        Tretja.Vodja v045 = new Tretja.Vodja("v045", 9469, v028);
        Tretja.Vodja v046 = new Tretja.Vodja("v046", 1558, v045);
        Tretja.Vodja v047 = new Tretja.Vodja("v047", 9144, v012);
        Tretja.Vodja v048 = new Tretja.Vodja("v048", 2150, null);
        Tretja.Vodja v049 = new Tretja.Vodja("v049", 5590, v001);
        Tretja.Vodja v050 = new Tretja.Vodja("v050", 2359, v012);
        Tretja.Vodja v051 = new Tretja.Vodja("v051", 2734, v017);
        Tretja.Vodja v052 = new Tretja.Vodja("v052", 5712, v028);
        Tretja.Vodja v053 = new Tretja.Vodja("v053", 3623, v044);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013, v014, v015, v016, v017, v018, v019, v020, v021, v022, v023, v024, v025, v026, v027, v028, v029, v030, v031, v032, v033, v034, v035, v036, v037, v038, v039, v040, v041, v042, v043, v044, v045, v046, v047, v048, v049, v050, v051, v052, v053};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
