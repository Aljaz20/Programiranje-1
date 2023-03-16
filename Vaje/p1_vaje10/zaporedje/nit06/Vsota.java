public class Vsota extends Zaporedje{

    private Zaporedje z1;
    private Zaporedje z2;

    public Vsota(Zaporedje z1, Zaporedje z2){
        this.z1 = z1;
        this.z2 = z2;
    }


    @Override
    public Integer y(int x) {
        if (z1.y(x) == null || z2.y(x) == null){
            return null;
        }else{
        return z1.y(x) + z2.y(x);
        }
    }




}