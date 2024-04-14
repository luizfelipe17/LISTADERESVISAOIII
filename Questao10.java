/*10.	Escreva um código Java que calcula a soma dos números pares de 1 a 100. 
Imprima esses números. 
*/
package com.mycompany.listaderevisaoiii;

public class Questao10 {
    public static void main (String[] args){
        
        int somaPar = 0;
        
        for (int i = 1; i <= 100; i++){
            
            if (i % 2 == 0){
                
                System.out.print(i + " + ");
                
                somaPar += i;
                
            }
            
        }
        
        System.out.print("\nSoma dos pares: " + somaPar);
        
    }
}
