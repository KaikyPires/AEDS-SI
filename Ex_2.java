package aeds;

import java.util.Random;

public class Ex_2 {
    public static void MaiorArray(int v[], int maior, int posição){
        
        int tamanho = v.length;
        
        if ( posição > tamanho ) {
            return;
            
        }
            else {
            if (v[posição] > maior) {
                 maior = v[posição];
                  MaiorArray(v, maior, posição + 1);
             }
        }
        
       
            
        }
        
    

    
    public static void main(String[] args) {
         
         Random random = new Random ();
         int posição = 0;
         int tamanho = 10;
         int v[] = new int [tamanho];
         int maior = 0;
       
         for (int i = 0; i < tamanho; i++) {
          v[i] = random.nextInt(100);
             
          if (v[i] > maior) {
                 maior = v[i];
             }
          
              System.out.print(v[i]+" ");
        }
         
           
          System.out.println(" ");
          System.out.print(maior+ " ");
         
          MaiorArray(v, maior, posição);
        
         
         
    }
    
}
