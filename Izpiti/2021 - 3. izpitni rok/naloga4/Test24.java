
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(5, 93, "aa"),
            new Cetrta.Prostor(8, 74, "bb"),
            new Cetrta.Prostor(7, 75, "bb"),
            new Cetrta.Prostor(5, 82, "aba"),
            new Cetrta.Prostor(7, 30, "bb"),
            new Cetrta.Prostor(2, 37, "bab"),
            new Cetrta.Prostor(8, 13, "aba"),
            new Cetrta.Prostor(3, 13, "baaa"),
            new Cetrta.Prostor(5, 74, "bb"),
            new Cetrta.Prostor(4, 5, "bab"),
            new Cetrta.Prostor(2, 82, "aa"),
            new Cetrta.Prostor(4, 99, "aba"),
            new Cetrta.Prostor(2, 43, "aabaa"),
            new Cetrta.Prostor(5, 21, "bb"),
            new Cetrta.Prostor(7, 4, "bb"),
            new Cetrta.Prostor(4, 47, "ba"),
            new Cetrta.Prostor(8, 38, "aba"),
            new Cetrta.Prostor(6, 42, "ba"),
            new Cetrta.Prostor(7, 17, "ba"),
            new Cetrta.Prostor(7, 95, "bab"),
            new Cetrta.Prostor(2, 70, "bab"),
            new Cetrta.Prostor(3, 68, "aabaa"),
            new Cetrta.Prostor(8, 10, "bb"),
            new Cetrta.Prostor(7, 84, "bab"),
            new Cetrta.Prostor(6, 41, "baaa"),
            new Cetrta.Prostor(2, 97, "ababa"),
            new Cetrta.Prostor(7, 3, "bb"),
            new Cetrta.Prostor(8, 100, "ba"),
            new Cetrta.Prostor(2, 60, "bb"),
            new Cetrta.Prostor(5, 25, "baaa"),
            new Cetrta.Prostor(1, 21, "aba"),
            new Cetrta.Prostor(5, 11, "ababa"),
            new Cetrta.Prostor(1, 55, "bab"),
            new Cetrta.Prostor(8, 25, "ba"),
            new Cetrta.Prostor(2, 21, "ba"),
            new Cetrta.Prostor(7, 93, "aba"),
            new Cetrta.Prostor(3, 84, "bb"),
            new Cetrta.Prostor(7, 99, "baaa"),
            new Cetrta.Prostor(4, 9, "aba"),
            new Cetrta.Prostor(3, 4, "bb"),
            new Cetrta.Prostor(6, 85, "bb"),
            new Cetrta.Prostor(8, 43, "bb"),
            new Cetrta.Prostor(1, 49, "ababa"),
            new Cetrta.Prostor(5, 76, "bab"),
            new Cetrta.Prostor(3, 12, "bb"),
            new Cetrta.Prostor(7, 27, "ababa"),
            new Cetrta.Prostor(5, 45, "bb"),
            new Cetrta.Prostor(4, 41, "ba"),
            new Cetrta.Prostor(6, 23, "ba"),
            new Cetrta.Prostor(2, 81, "bab"),
            new Cetrta.Prostor(3, 46, "aa"),
            new Cetrta.Prostor(7, 38, "aa"),
            new Cetrta.Prostor(2, 14, "baaa"),
            new Cetrta.Prostor(2, 11, "ababa"),
            new Cetrta.Prostor(6, 77, "bb"),
            new Cetrta.Prostor(8, 59, "bab"),
            new Cetrta.Prostor(4, 84, "ba"),
            new Cetrta.Prostor(8, 33, "bab"),
            new Cetrta.Prostor(2, 12, "aba")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
