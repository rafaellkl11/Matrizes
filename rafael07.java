/*7. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).*/

import java.util.*;
public class rafael07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] matriz = new double[4][7];

        System.out.println("7. Programa que identifica o MINMAX de uma matriz de 4 x 7");

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ; j++){
                System.out.println("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+" :");
                matriz[i][j] = teclado.nextDouble();
            }
        }

        teclado.close();
    }
}
