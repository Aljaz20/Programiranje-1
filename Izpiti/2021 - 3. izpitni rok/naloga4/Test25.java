
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(1, 86, "ba"),
            new Cetrta.Prostor(7, 59, "ba"),
            new Cetrta.Prostor(4, 59, "ba"),
            new Cetrta.Prostor(4, 88, "aaa"),
            new Cetrta.Prostor(1, 18, "abbab"),
            new Cetrta.Prostor(2, 97, "aba"),
            new Cetrta.Prostor(6, 95, "aba"),
            new Cetrta.Prostor(2, 28, "abbab"),
            new Cetrta.Prostor(6, 8, "bb"),
            new Cetrta.Prostor(7, 68, "bb"),
            new Cetrta.Prostor(5, 29, "aaab"),
            new Cetrta.Prostor(3, 45, "ba"),
            new Cetrta.Prostor(6, 9, "aaab"),
            new Cetrta.Prostor(4, 45, "baaab"),
            new Cetrta.Prostor(6, 30, "ba"),
            new Cetrta.Prostor(6, 59, "aaab"),
            new Cetrta.Prostor(5, 10, "baaab"),
            new Cetrta.Prostor(7, 66, "abbab"),
            new Cetrta.Prostor(3, 64, "baaab"),
            new Cetrta.Prostor(6, 11, "aaa"),
            new Cetrta.Prostor(2, 13, "aaa"),
            new Cetrta.Prostor(4, 40, "aaab"),
            new Cetrta.Prostor(3, 48, "abbab"),
            new Cetrta.Prostor(5, 44, "ba"),
            new Cetrta.Prostor(2, 36, "ba"),
            new Cetrta.Prostor(3, 10, "ba"),
            new Cetrta.Prostor(3, 80, "aaa"),
            new Cetrta.Prostor(6, 80, "baaab"),
            new Cetrta.Prostor(2, 27, "aba"),
            new Cetrta.Prostor(6, 32, "abbab"),
            new Cetrta.Prostor(2, 12, "aaab"),
            new Cetrta.Prostor(6, 51, "bb"),
            new Cetrta.Prostor(7, 25, "abbab"),
            new Cetrta.Prostor(5, 61, "aaa"),
            new Cetrta.Prostor(6, 64, "ba"),
            new Cetrta.Prostor(1, 44, "aaa"),
            new Cetrta.Prostor(6, 25, "aaab"),
            new Cetrta.Prostor(3, 96, "ba"),
            new Cetrta.Prostor(3, 57, "ba"),
            new Cetrta.Prostor(3, 47, "abbab"),
            new Cetrta.Prostor(5, 71, "aaab"),
            new Cetrta.Prostor(3, 73, "aaa"),
            new Cetrta.Prostor(4, 9, "aaab"),
            new Cetrta.Prostor(2, 98, "aaa"),
            new Cetrta.Prostor(4, 87, "aaa"),
            new Cetrta.Prostor(4, 20, "bb"),
            new Cetrta.Prostor(7, 32, "aba"),
            new Cetrta.Prostor(6, 47, "aaab"),
            new Cetrta.Prostor(6, 67, "baaab"),
            new Cetrta.Prostor(7, 18, "baaab"),
            new Cetrta.Prostor(6, 73, "aba"),
            new Cetrta.Prostor(3, 90, "baaab"),
            new Cetrta.Prostor(5, 3, "aaab"),
            new Cetrta.Prostor(2, 35, "aaa"),
            new Cetrta.Prostor(6, 49, "baaab"),
            new Cetrta.Prostor(5, 81, "baaab"),
            new Cetrta.Prostor(3, 20, "aba"),
            new Cetrta.Prostor(2, 77, "baaab"),
            new Cetrta.Prostor(4, 76, "abbab"),
            new Cetrta.Prostor(7, 30, "baaab"),
            new Cetrta.Prostor(5, 30, "aaa"),
            new Cetrta.Prostor(3, 78, "baaab"),
            new Cetrta.Prostor(7, 65, "ba"),
            new Cetrta.Prostor(4, 95, "aaab"),
            new Cetrta.Prostor(1, 8, "aaab"),
            new Cetrta.Prostor(5, 94, "bb"),
            new Cetrta.Prostor(7, 38, "abbab"),
            new Cetrta.Prostor(4, 44, "aaab"),
            new Cetrta.Prostor(6, 100, "aba"),
            new Cetrta.Prostor(6, 82, "ba")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
