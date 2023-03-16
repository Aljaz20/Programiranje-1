public class Zival{

    private static int[] hranjenja = new int[9];
    private static int[][] preganjanja = new int[9][9];

    
    private int[] hierhija(){
        if (this instanceof Tiger){
            return new int[]{0, 1, 3, 7};
        }else if (this instanceof Lev){
            return new int[]{0, 1, 3, 8};
        }else if (this instanceof Macka){
            return new int[]{0,1,3};
        }else if (this instanceof Medved){
            return new int[]{0,1,4};
        }else if (this instanceof Sesalec){
            return new int[]{0,1};
        }else if (this instanceof Zelva){
            return new int[]{0,2,5};
        }else if (this instanceof Kaca){
            return new int[]{0,2,6};
        }else if (this instanceof Plazilec){
            return new int[]{0,2};
        }else if (this instanceof Zival){
            return new int[]{0};
        }
        return null;
    }

    public void seHrani(){
        for(int a: this.hierhija()){
            hranjenja[a]++;
        }
    }

    public void preganja(Zival druga){
        for(int a: this.hierhija()){
            for(int b: druga.hierhija()){
                preganjanja[a][b]++;
            }
        }
    }

    public int steviloHranjenj(){
        return hranjenja[this.hierhija()[this.hierhija().length - 1]];
    }

    public int steviloPreganjanj(Zival druga){
        return preganjanja[this.hierhija()[this.hierhija().length - 1]][druga.hierhija()[druga.hierhija().length - 1]];
    }
}