/*2. Faça um programa que preencha uma matriz 3 x 5 com números reais. Some os valores de cada linha e
armazene em um vetor. A seguir, mostre qual a linha que tem maior valor somado.*/

import java.util.*;
public class rafael02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] matriz = new double[3][5];
        double[] vetor = new double [matriz.length];

        System.out.println("2. Programa que recebe uma matriz e calcula o resultado da noma de cada linha");

        for ( int i = 0 ; i < matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+": ");
                matriz[i][j] = teclado.nextDouble();
            }
        }
        
        System.out.println("Matriz:");

        for (int i = 0 ; i < matriz.length ; i++){
            System.out.print(" | ");
            for ( int j = 0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.print("\n");
        }

        for (int i = 0 ; i < matriz.length ;  i++){
            for ( int j = 0 ; j < matriz[i].length ; j++){
                vetor[i] = vetor[i] + matriz[i][j];
            }
        }

        System.out.println("Resultado: ");
        for (  int i = 0 ; i < vetor.length ; i++){
            System.out.print(vetor[i]+", ");
        }

        teclado.close();
    }
}
