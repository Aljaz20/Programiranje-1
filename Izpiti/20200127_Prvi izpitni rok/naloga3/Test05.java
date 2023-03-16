
public class Test05 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 8188, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 1094, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 4016, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 1650, v000);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 2084, v003);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 3144, null);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 8568, v001);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 2773, v006);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 1147, v005);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 1345, v007);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 1425, v005);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 3501, v001);
        Tretja.Vodja v012 = new Tretja.Vodja("v012", 2227, v004);
        Tretja.Vodja v013 = new Tretja.Vodja("v013", 7762, v010);

        Tretja.Delavec d000 = new Tretja.Delavec("d000", 2265, v002);
        Tretja.Delavec d001 = new Tretja.Delavec("d001", 1191, v006);
        Tretja.Delavec d002 = new Tretja.Delavec("d002", 8075, v004);
        Tretja.Delavec d003 = new Tretja.Delavec("d003", 1307, v012);
        Tretja.Delavec d004 = new Tretja.Delavec("d004", 8211, v008);
        Tretja.Delavec d005 = new Tretja.Delavec("d005", 1071, null);
        Tretja.Delavec d006 = new Tretja.Delavec("d006", 5758, v006);
        Tretja.Delavec d007 = new Tretja.Delavec("d007", 8153, v006);
        Tretja.Delavec d008 = new Tretja.Delavec("d008", 9319, v001);
        Tretja.Delavec d009 = new Tretja.Delavec("d009", 3653, v007);
        Tretja.Delavec d010 = new Tretja.Delavec("d010", 2496, null);
        Tretja.Delavec d011 = new Tretja.Delavec("d011", 2217, v006);
        Tretja.Delavec d012 = new Tretja.Delavec("d012", 5445, v011);

        Tretja.Zaposleni[] zaposleni = {
            v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011, v012, v013,
            d000, d001, d002, d003, d004, d005, d006, d007, d008, d009, d010, d011, d012
        };

        System.out.println("[ placaNadrejenega ]");
        for (Tretja.Zaposleni z: zaposleni) {
            System.out.printf("%s -> %d%n", z, z.placaNadrejenega());
        }
    }
}
