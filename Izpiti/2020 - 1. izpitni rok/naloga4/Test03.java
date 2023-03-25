
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(4, 17),
            new Cetrta.Celica(6, 16),
            new Cetrta.Celica(10, 6),
            new Cetrta.Celica(14, 0),
            new Cetrta.Celica(14, 5)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
