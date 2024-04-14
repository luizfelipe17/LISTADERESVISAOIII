/*11.	Escreva um código Java que simula o jogo da adivinhação. */
package com.mycompany.listaderevisaoiii;
import java.util.*;

public class Questao11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        int numero = 0, resposta = 0, alternativa = 9, tentativas = 1;

        while (true) {

            while (alternativa == 9) {

                System.out.print("Bem-vindo ao Jogo da Adivinhação\n"
                        + "Estou pensando em um número entre 1 e 100...\n\n");

                numero = numeroAleatorio.nextInt(99) + 1;

                System.out.print("Informe um número: ");
                resposta = ler.nextInt();
                tentativas = 1;
                alternativa++;
                break;

            }

            if (resposta > 100 || resposta < 1) {

                System.out.print("Por favor, informe um número entre 1 e 100...\n");
                System.out.print("Informe um número: ");
                resposta = ler.nextInt();

            } else if (resposta < numero) {

                System.out.print("Muito Baixo, tente novamente\n");
                System.out.print("Informe um número: ");
                resposta = ler.nextInt();

                tentativas++;

            } else if (resposta > numero) {

                System.out.print("Muito Alto, tente novamente\n");
                System.out.print("Informe um número: ");
                resposta = ler.nextInt();

                tentativas++;

            } else if (resposta == numero) {

                System.out.print("\nParabéns!!! Você acertou o número em " + tentativas + " tentativas!");
                System.out.println("\n\n0 - SAIR       9 - JOGAR NOVAMENTE");
                alternativa = ler.nextInt();

                if (alternativa == 0) {

                    System.out.print("\nOBRIGADO POR JOGAR, ATÉ A PROXIMA!!!");

                    break;

                }
                if (alternativa == 9) {

                    System.out.print("\nÓtimo vamos jogar novamente\n");

                }
                while (alternativa != 0 && alternativa != 9) {

                    System.out.println("\n\nInforme um valor válido\n 0 - SAIR       9 - JOGAR NOVAMENTE");
                    alternativa = ler.nextInt();

                }
            }
        }
    }
}
