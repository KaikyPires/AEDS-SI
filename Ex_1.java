
package aeds;

import java.util.Random;

public class Ex_1 {
    public static void ExibirArray(int v[], int posição){
        int tamanho = v.length;
        if (posição >= tamanho) {
            return;
        }
            else {
                    System.out.print(v[posição]+" ");
                    ExibirArray(v, posição +1);
                    
                    }
        }
             public static void main(String[] args) {
         Random random = new Random ();
         
         
         int tamanho = 10;
         int v[] = new int [tamanho];
        
       
         for (int i = 0; i < tamanho; i++) {
         v[i]= random.nextInt(100);
              System.out.print(v[i]+" ");
        }
         int posição = 0;
          System.out.println(" ");
          ExibirArray(v, posição);
    }
    
}
