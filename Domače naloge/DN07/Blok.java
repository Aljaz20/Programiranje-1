import java.util.Arrays;
public class Blok {

    private Stanovanje[] blok;
    private Stanovanje stanovanje;

    public Blok(Stanovanje stanovanje) {
        this.stanovanje = stanovanje;
        this.blok = null;
    }

    private void stanovanjavbloku(){
        Stanovanje[] nepodvojena = new Stanovanje[1000];
        nepodvojena[0] = this.stanovanje;
        int counter = 1;
        
    }

    public Oseba starosta() {
        // dopolnite/popravite ...
        return null;
    }

    public int[][] razporeditev() {
        // dopolnite/popravite ...
        return null;
    }
}
