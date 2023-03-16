
public class Test14 {

    public static void main(String[] args) {
        Stanovanje s = new Stanovanje(new Oseba[]{new Oseba("A B", 'M', 15), new Oseba("P Q", 'Z', 23)});
        TestSkupno.preveri(s.steviloStanovalcev() == 2);
    }
}
