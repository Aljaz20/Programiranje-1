
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test11 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        List<Cetrta.Celica> celice = new ArrayList<>(Arrays.asList(
            new Cetrta.Celica(6, 0),
            new Cetrta.Celica(0, 7),
            new Cetrta.Celica(1, 6),
            new Cetrta.Celica(2, 9),
            new Cetrta.Celica(7, 3),
            new Cetrta.Celica(2, 1),
            new Cetrta.Celica(5, 3),
            new Cetrta.Celica(2, 4),
            new Cetrta.Celica(6, 1),
            new Cetrta.Celica(4, 10),
            new Cetrta.Celica(0, 5),
            new Cetrta.Celica(7, 4),
            new Cetrta.Celica(5, 4),
            new Cetrta.Celica(3, 0),
            new Cetrta.Celica(8, 3),
            new Cetrta.Celica(7, 10),
            new Cetrta.Celica(6, 2),
            new Cetrta.Celica(10, 9),
            new Cetrta.Celica(5, 7),
            new Cetrta.Celica(5, 2),
            new Cetrta.Celica(0, 8),
            new Cetrta.Celica(2, 8),
            new Cetrta.Celica(5, 1),
            new Cetrta.Celica(3, 9),
            new Cetrta.Celica(8, 7),
            new Cetrta.Celica(3, 4),
            new Cetrta.Celica(4, 4),
            new Cetrta.Celica(3, 1),
            new Cetrta.Celica(8, 10),
            new Cetrta.Celica(2, 7),
            new Cetrta.Celica(4, 2),
            new Cetrta.Celica(10, 6),
            new Cetrta.Celica(5, 9),
            new Cetrta.Celica(1, 8),
            new Cetrta.Celica(0, 0),
            new Cetrta.Celica(3, 5),
            new Cetrta.Celica(1, 3),
            new Cetrta.Celica(7, 2),
            new Cetrta.Celica(3, 2),
            new Cetrta.Celica(1, 0),
            new Cetrta.Celica(4, 9),
            new Cetrta.Celica(1, 4),
            new Cetrta.Celica(8, 2),
            new Cetrta.Celica(5, 0),
            new Cetrta.Celica(0, 10),
            new Cetrta.Celica(6, 7),
            new Cetrta.Celica(8, 5),
            new Cetrta.Celica(6, 4),
            new Cetrta.Celica(4, 5),
            new Cetrta.Celica(10, 8),
            new Cetrta.Celica(4, 7)
        ));
        celice.sort(null);
        System.out.println(celice);
    }
}
