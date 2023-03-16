
public class Test11 {

    public static void main(String[] args) {
        Stanovanje s = new Stanovanje(new Oseba[0]);
        TestSkupno.preveri(s.steviloStanovalcev() == 0);
    }
}
