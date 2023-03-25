
public class Test17 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 8535, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 8553, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 6882, v001);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 1750, v001);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 2693, v001);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 2619, null);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 3527, v003);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 5288, v001);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 1960, v004);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 1661, v004);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 6261, v008);

        Tretja.Delavec d000 = new Tretja.Delavec("d000", 3671, v009);
        Tretja.Delavec d001 = new Tretja.Delavec("d001", 7814, v004);
        Tretja.Delavec d002 = new Tretja.Delavec("d002", 5674, v002);
        Tretja.Delavec d003 = new Tretja.Delavec("d003", 3249, v000);
        Tretja.Delavec d004 = new Tretja.Delavec("d004", 6244, v003);
        Tretja.Delavec d005 = new Tretja.Delavec("d005", 1097, v009);
        Tretja.Delavec d006 = new Tretja.Delavec("d006", 5313, v000);
        Tretja.Delavec d007 = new Tretja.Delavec("d007", 6097, v005);
        Tretja.Delavec d008 = new Tretja.Delavec("d008", 9988, v010);
        Tretja.Delavec d009 = new Tretja.Delavec("d009", 8092, v003);
        Tretja.Delavec d010 = new Tretja.Delavec("d010", 9425, v003);
        Tretja.Delavec d011 = new Tretja.Delavec("d011", 7388, null);
        Tretja.Delavec d012 = new Tretja.Delavec("d012", 4966, null);
        Tretja.Delavec d013 = new Tretja.Delavec("d013", 5131, v003);
        Tretja.Delavec d014 = new Tretja.Delavec("d014", 6360, v003);
        Tretja.Delavec d015 = new Tretja.Delavec("d015", 1484, null);
        Tretja.Delavec d016 = new Tretja.Delavec("d016", 6945, v003);
        Tretja.Delavec d017 = new Tretja.Delavec("d017", 8321, v007);
        Tretja.Delavec d018 = new Tretja.Delavec("d018", 7005, v006);
        Tretja.Delavec d019 = new Tretja.Delavec("d019", 2736, v007);
        Tretja.Delavec d020 = new Tretja.Delavec("d020", 8793, v006);
        Tretja.Delavec d021 = new Tretja.Delavec("d021", 9672, v006);
        Tretja.Delavec d022 = new Tretja.Delavec("d022", 2709, v003);
        Tretja.Delavec d023 = new Tretja.Delavec("d023", 6426, v005);

        Tretja.Zaposleni[] zaposleni = {
            v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010,
            d000, d001, d002, d003, d004, d005, d006, d007, d008, d009, d010, d011, d012, d013, d014, d015, d016, d017, d018, d019, d020, d021, d022, d023
        };

        System.out.println("[ placaNadrejenega ]");
        for (Tretja.Zaposleni z: zaposleni) {
            System.out.printf("%s -> %d%n", z, z.placaNadrejenega());
        }
    }
}
