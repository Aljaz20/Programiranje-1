
import java.util.*;

public class Tekma {

    private String domaci;
    private String gostje;
    private int goliDomacih;
    private int goliGostov;

    public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
        this.domaci = domaci;
        this.gostje = gostje;
        this.goliDomacih = goliDomacih;
        this.goliGostov = goliGostov;
    }

    @Override
    public String toString() {
        return String.format("%s %d : %d %s", this.domaci, this.goliDomacih,
                this.goliGostov, this.gostje);
    }
    public String getDomaci(){
        return this.domaci;
    }
    public String getGostje(){
        return this.gostje;
    }
    public int getGoliDomacih(){
        return this.goliDomacih;
    }
    public int getGoliGostov(){
        return this.goliGostov;
    }
    public int razlika(){
        return Math.abs(this.goliDomacih - this.goliGostov);
    }
}
