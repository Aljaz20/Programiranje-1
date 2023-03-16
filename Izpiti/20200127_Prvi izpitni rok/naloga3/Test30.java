
public class Test30 {

    public static void main(String[] args) {
        Tretja.Vodja v000 = new Tretja.Vodja("v000", 2920, null);
        Tretja.Vodja v001 = new Tretja.Vodja("v001", 3041, null);
        Tretja.Vodja v002 = new Tretja.Vodja("v002", 4998, v000);
        Tretja.Vodja v003 = new Tretja.Vodja("v003", 2857, v000);
        Tretja.Vodja v004 = new Tretja.Vodja("v004", 4104, v001);
        Tretja.Vodja v005 = new Tretja.Vodja("v005", 3221, v002);
        Tretja.Vodja v006 = new Tretja.Vodja("v006", 6819, v001);
        Tretja.Vodja v007 = new Tretja.Vodja("v007", 1543, v005);
        Tretja.Vodja v008 = new Tretja.Vodja("v008", 1811, v005);
        Tretja.Vodja v009 = new Tretja.Vodja("v009", 7476, v000);
        Tretja.Vodja v010 = new Tretja.Vodja("v010", 3690, null);
        Tretja.Vodja v011 = new Tretja.Vodja("v011", 6940, v004);

        Tretja.Vodja[] vodje = {v000, v001, v002, v003, v004, v005, v006, v007, v008, v009, v010, v011};

        System.out.println("[ vrhovni ]");
        for (Tretja.Vodja v: vodje) {
            System.out.printf("%s -> %s%n", v, v.vrhovni());
        }
    }
}
