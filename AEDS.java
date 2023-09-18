
package aeds;

import java.util.Scanner;

public class EX_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x = teclado.nextInt();
         int aux = x;
         
            if(x == 1){
                x = 1;
            }
            while (aux > 1){
               
                 x = (x + aux - 1);
                 aux = aux - 1;   
                    
            }
            System.out.println(x+"");
    }
    
}
