
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test14 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(2, 1),
            new Cetrta.Celica(1, 0),
            new Cetrta.Celica(6, 4),
            new Cetrta.Celica(5, 1),
            new Cetrta.Celica(1, 2),
            new Cetrta.Celica(0, 1),
            new Cetrta.Celica(5, 6),
            new Cetrta.Celica(6, 6),
            new Cetrta.Celica(5, 5),
            new Cetrta.Celica(4, 5),
            new Cetrta.Celica(5, 3),
            new Cetrta.Celica(2, 0),
            new Cetrta.Celica(1, 3),
            new Cetrta.Celica(0, 3),
            new Cetrta.Celica(2, 2),
            new Cetrta.Celica(3, 6),
            new Cetrta.Celica(4, 0),
            new Cetrta.Celica(3, 4),
            new Cetrta.Celica(1, 1),
            new Cetrta.Celica(3, 2)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
