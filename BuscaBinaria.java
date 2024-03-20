/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscabinaria;

public class BuscaBinaria {
    public static int Buscabinaria(int [] array, int num, int inicio, int fim){
        
        if(inicio > fim){
            return -1;
        }
        int meio = (inicio + fim) / 2;
        if (array[meio] == num){
            return meio;
        }
        else if(array[meio] < num){
        return Buscabinaria(array, num, meio + 1, fim);
        
    }else{
             return Buscabinaria(array, num, inicio, fim - 1);
        }
    }
    public static void main(String[] args) {
        int array[] = {3,4,7, 9, 11, 16, 19, 23, 29, 32};
        int num = 11;
        int result = Buscabinaria(array, num, 0, array.length -1);
        
        if (result != -1){
            System.out.println("Num encontrado:" +result);
        } else{
            System.out.println("Nao encontrado");
        }
        
    }
    
}
