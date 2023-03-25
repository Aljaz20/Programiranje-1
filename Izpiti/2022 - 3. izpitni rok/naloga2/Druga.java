
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] tabela = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                tabela[i][j] = sc.nextInt();
            }
        }
        int stevilo = 0;
        int vsota = 0;
        boolean vn = true;

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                vsota = 0;
                if(tabela[i][j]==1){
                    if((j==0)||(j == tabela[0].length-1)||(i == tabela.length-1)||(i == 0)){
                        stevilo++;
                    }else{
                        for(int k = -1 ; k < 2; k++){
                            for(int l = -1; l < 2; l++){
                                if((k == 0 && l == 0)){
                                    continue;
                                }
                                vsota += tabela[i+k][j+l];
                            }                            
                        }
                        if(vsota < 8){
                            stevilo++;
                        }
                    }
                   
                }
                
            }
        }
        System.out.print(stevilo);
    }
}
