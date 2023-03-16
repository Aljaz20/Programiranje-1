
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 9, "baab"),
            new Cetrta.Prostor(3, 82, "abbab"),
            new Cetrta.Prostor(3, 78, "bbaab"),
            new Cetrta.Prostor(3, 19, "bbaab"),
            new Cetrta.Prostor(6, 13, "ab"),
            new Cetrta.Prostor(5, 27, "baab"),
            new Cetrta.Prostor(6, 25, "aa"),
            new Cetrta.Prostor(5, 45, "ab"),
            new Cetrta.Prostor(6, 99, "baab"),
            new Cetrta.Prostor(6, 59, "aa"),
            new Cetrta.Prostor(2, 21, "abbab"),
            new Cetrta.Prostor(1, 16, "ab"),
            new Cetrta.Prostor(5, 3, "bbaab"),
            new Cetrta.Prostor(5, 67, "bbaab"),
            new Cetrta.Prostor(1, 8, "abbab"),
            new Cetrta.Prostor(3, 18, "ab"),
            new Cetrta.Prostor(2, 39, "abbab"),
            new Cetrta.Prostor(5, 26, "abbab"),
            new Cetrta.Prostor(6, 57, "bbaab"),
            new Cetrta.Prostor(5, 52, "aa"),
            new Cetrta.Prostor(6, 94, "abbab"),
            new Cetrta.Prostor(1, 84, "bbaab"),
            new Cetrta.Prostor(6, 6, "bbaab"),
            new Cetrta.Prostor(6, 95, "bbaab"),
            new Cetrta.Prostor(5, 91, "aa"),
            new Cetrta.Prostor(6, 61, "abbab"),
            new Cetrta.Prostor(5, 88, "abbab"),
            new Cetrta.Prostor(6, 45, "ab"),
            new Cetrta.Prostor(5, 51, "abbab"),
            new Cetrta.Prostor(3, 31, "bbaab"),
            new Cetrta.Prostor(2, 30, "baab"),
            new Cetrta.Prostor(4, 88, "abbab"),
            new Cetrta.Prostor(1, 67, "aa"),
            new Cetrta.Prostor(6, 70, "baab"),
            new Cetrta.Prostor(3, 55, "aa"),
            new Cetrta.Prostor(5, 49, "ab"),
            new Cetrta.Prostor(3, 9, "baab"),
            new Cetrta.Prostor(5, 83, "aa"),
            new Cetrta.Prostor(3, 51, "aa"),
            new Cetrta.Prostor(1, 56, "aa"),
            new Cetrta.Prostor(1, 29, "abbab"),
            new Cetrta.Prostor(6, 47, "abbab"),
            new Cetrta.Prostor(2, 57, "abbab"),
            new Cetrta.Prostor(1, 15, "aa"),
            new Cetrta.Prostor(1, 53, "aa"),
            new Cetrta.Prostor(5, 64, "bbaab"),
            new Cetrta.Prostor(4, 25, "baab"),
            new Cetrta.Prostor(3, 12, "aa"),
            new Cetrta.Prostor(4, 59, "ab"),
            new Cetrta.Prostor(3, 79, "bbaab"),
            new Cetrta.Prostor(3, 45, "ab"),
            new Cetrta.Prostor(4, 50, "baab"),
            new Cetrta.Prostor(6, 9, "aa"),
            new Cetrta.Prostor(1, 13, "baab"),
            new Cetrta.Prostor(3, 75, "baab"),
            new Cetrta.Prostor(4, 67, "ab"),
            new Cetrta.Prostor(4, 4, "bbaab")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
