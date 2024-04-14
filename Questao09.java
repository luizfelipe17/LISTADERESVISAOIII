/*9.	Escreva um código Java que lê um número inteiro do usuário e imprime a sua tabuada. */
package com.mycompany.listaderevisaoiii;
import java.util.Scanner;

public class Questao09 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Informe um número: ");
        numero = ler.nextInt();
        System.out.print("");
        
        for (int i = 1; i <= 10; i++){
            
            int tabuada = numero * i;
            
            System.out.println(+ numero + " x " + i + " = "+tabuada);
            
        }
    }
}
