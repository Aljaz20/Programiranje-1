
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(4, 0),
            new Cetrta.Celica(4, 1),
            new Cetrta.Celica(6, 5)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
