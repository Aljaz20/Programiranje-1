
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        Integer min = this.y(interval.vrniZacetek());
        Integer max = min;
        for (int i = interval.vrniZacetek() + 1; i <= interval.vrniKonec() ; i++) {
            Integer y = this.y(i);
            if (y != null){
                min = (min == null) ? (y) : (Math.min(min, y));
                max = (max == null) ? (y) : (Math.max(max, y));
            }
        }
        return new Interval(min, max);   
    }
    
    public boolean jeMonotono(Interval interval) {
        
        return this.jeMonotono(interval, 1) || this.jeMonotono(interval, -1);
    }


    private boolean jeMonotono(Interval interval, int smer) {
        Integer prejsnji = null;
        for (int i = interval.vrniZacetek(); i <= interval.vrniKonec(); i++) {
            Integer y = this.y(i);
            if (y != null){
                if (prejsnji != null && prejsnji * smer >= y * smer){
                    return false;
                }
                prejsnji = y;
            }
        }
        return true;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
        if (!this.jeMonotono(interval)){
            return null;
        }
        return new Inverz(this, interval);
    }
}
