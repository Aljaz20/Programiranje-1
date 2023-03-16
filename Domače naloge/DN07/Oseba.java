
public class Oseba {

    protected String ip;
    protected char spol;
    protected int starost;

    public Oseba(String ip, char spol, int starost) {
        this.ip = ip;
        this.spol = spol;
        this.starost = starost;
    }

    public String toString() {
        return String.format("%s, %c, %d", this.ip, this.spol, this.starost);
    }

    public boolean jeStarejsaOd(Oseba os) {

        return this.starost > os.starost;
    }
}
