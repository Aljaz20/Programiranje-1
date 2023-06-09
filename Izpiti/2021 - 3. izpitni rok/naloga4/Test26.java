
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        List<Cetrta.Prostor> prostori = new ArrayList<>(List.of(
            new Cetrta.Prostor(10, 96, "bb"),
            new Cetrta.Prostor(6, 67, "abba"),
            new Cetrta.Prostor(7, 67, "aaaaa"),
            new Cetrta.Prostor(6, 10, "aba"),
            new Cetrta.Prostor(7, 99, "aba"),
            new Cetrta.Prostor(4, 85, "aba"),
            new Cetrta.Prostor(2, 18, "bbbaa"),
            new Cetrta.Prostor(6, 2, "aba"),
            new Cetrta.Prostor(3, 27, "aaaaa"),
            new Cetrta.Prostor(1, 21, "abba"),
            new Cetrta.Prostor(10, 61, "bb"),
            new Cetrta.Prostor(4, 4, "aba"),
            new Cetrta.Prostor(3, 57, "abba"),
            new Cetrta.Prostor(9, 2, "bb"),
            new Cetrta.Prostor(10, 91, "bbbaa"),
            new Cetrta.Prostor(10, 92, "bb"),
            new Cetrta.Prostor(3, 52, "aba"),
            new Cetrta.Prostor(2, 39, "abaaa"),
            new Cetrta.Prostor(9, 55, "abba"),
            new Cetrta.Prostor(6, 27, "aba"),
            new Cetrta.Prostor(6, 87, "bbbaa"),
            new Cetrta.Prostor(4, 83, "bbbaa"),
            new Cetrta.Prostor(5, 27, "abaaa"),
            new Cetrta.Prostor(7, 32, "aaa"),
            new Cetrta.Prostor(3, 5, "bb"),
            new Cetrta.Prostor(7, 4, "aaaaa"),
            new Cetrta.Prostor(8, 82, "abaaa"),
            new Cetrta.Prostor(2, 54, "aba"),
            new Cetrta.Prostor(5, 60, "aaaaa"),
            new Cetrta.Prostor(8, 3, "bbbaa"),
            new Cetrta.Prostor(6, 16, "bbbaa"),
            new Cetrta.Prostor(1, 74, "bbbaa"),
            new Cetrta.Prostor(2, 24, "aaaaa"),
            new Cetrta.Prostor(9, 52, "bbbaa"),
            new Cetrta.Prostor(7, 58, "abaaa"),
            new Cetrta.Prostor(8, 5, "abba"),
            new Cetrta.Prostor(5, 45, "abba"),
            new Cetrta.Prostor(2, 57, "aba"),
            new Cetrta.Prostor(8, 65, "bbbab"),
            new Cetrta.Prostor(1, 76, "aaa"),
            new Cetrta.Prostor(7, 55, "bbbab"),
            new Cetrta.Prostor(2, 19, "aba"),
            new Cetrta.Prostor(1, 31, "aba"),
            new Cetrta.Prostor(6, 72, "bbbab"),
            new Cetrta.Prostor(9, 12, "abaaa"),
            new Cetrta.Prostor(10, 77, "abba"),
            new Cetrta.Prostor(7, 74, "bb"),
            new Cetrta.Prostor(8, 92, "aba"),
            new Cetrta.Prostor(4, 44, "bb"),
            new Cetrta.Prostor(8, 81, "aba"),
            new Cetrta.Prostor(5, 84, "bb"),
            new Cetrta.Prostor(1, 12, "bb"),
            new Cetrta.Prostor(1, 88, "abaaa"),
            new Cetrta.Prostor(3, 40, "aaaaa"),
            new Cetrta.Prostor(10, 15, "aba"),
            new Cetrta.Prostor(8, 98, "abaaa"),
            new Cetrta.Prostor(8, 51, "aaa"),
            new Cetrta.Prostor(10, 23, "aaa"),
            new Cetrta.Prostor(6, 6, "bb"),
            new Cetrta.Prostor(9, 13, "aba"),
            new Cetrta.Prostor(4, 93, "abaaa"),
            new Cetrta.Prostor(4, 57, "abba"),
            new Cetrta.Prostor(8, 71, "bb"),
            new Cetrta.Prostor(7, 61, "bbbab"),
            new Cetrta.Prostor(8, 15, "bbbaa"),
            new Cetrta.Prostor(2, 8, "aba"),
            new Cetrta.Prostor(6, 22, "aba"),
            new Cetrta.Prostor(7, 62, "abaaa"),
            new Cetrta.Prostor(6, 88, "abba"),
            new Cetrta.Prostor(2, 86, "bbbab"),
            new Cetrta.Prostor(1, 93, "abba"),
            new Cetrta.Prostor(5, 18, "abaaa"),
            new Cetrta.Prostor(4, 2, "aaa"),
            new Cetrta.Prostor(10, 29, "bb"),
            new Cetrta.Prostor(2, 41, "bb"),
            new Cetrta.Prostor(9, 37, "bbbaa"),
            new Cetrta.Prostor(2, 96, "bb"),
            new Cetrta.Prostor(3, 67, "aaaaa"),
            new Cetrta.Prostor(10, 48, "abaaa"),
            new Cetrta.Prostor(1, 57, "bb"),
            new Cetrta.Prostor(9, 24, "bb"),
            new Cetrta.Prostor(10, 47, "aaaaa"),
            new Cetrta.Prostor(1, 95, "abaaa"),
            new Cetrta.Prostor(8, 88, "abaaa"),
            new Cetrta.Prostor(8, 30, "bbbaa"),
            new Cetrta.Prostor(10, 93, "abaaa"),
            new Cetrta.Prostor(2, 95, "aba"),
            new Cetrta.Prostor(6, 3, "abaaa"),
            new Cetrta.Prostor(1, 22, "bbbab"),
            new Cetrta.Prostor(2, 75, "bb"),
            new Cetrta.Prostor(6, 74, "aaa"),
            new Cetrta.Prostor(5, 54, "abaaa"),
            new Cetrta.Prostor(3, 30, "aba")
        ));

        Cetrta.uredi(prostori);

        for (Cetrta.Prostor prostor: prostori) {
            System.out.println(prostor);
        }
    }
}
