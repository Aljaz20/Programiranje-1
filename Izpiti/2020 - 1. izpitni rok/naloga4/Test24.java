
public class Test24 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        Cetrta.Ovojnik ovojnik = new Cetrta.Ovojnik(new boolean[][]{
            {F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F},
            {T, F, F, F, F, T, F, F, F},
            {F, T, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F},
            {T, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F},
        });
        System.out.println(ovojnik.enice());
    }
}
