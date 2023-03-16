public class Inverz extends Zaporedje{
    
    private Zaporedje z;
    private Interval in;

    public Inverz(Zaporedje z, Interval i){
        this.z = z;
        this.in = i;
    }


    @Override
    public Integer y(int x){
        for ( int i = this.in.vrniZacetek(); i <= this.in.vrniKonec(); i++){
            Integer y = this.z.y(i);
            if (y != null && y == x){
                return i;
            }
        }
        return null;
    }

}