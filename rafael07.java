/*7. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).*/

import java.util.*;
public class rafael07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] matriz = new double[4][7];
        double min, minMax;

        minMax = 0;

        System.out.println("7. Programa que identifica o MINMAX de uma matriz de 4 x 7");

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+" :");
                matriz[i][j] = teclado.nextDouble();
            }
        }

        min = matriz[0][0];

        for(int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                if (matriz[i][j] < min){
                    min = matriz[i][j];
                }
            }
        }

        for(int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                if (matriz[i][j] == min){
                    minMax = matriz[0][0];
                    for (int k = 0 ; k < matriz[i].length ; k++){
                        if (matriz[i][k] > minMax){
                            minMax = matriz[i][k];
                        }
                    }
                }
            }
        }

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){   
                if(matriz[i][j] == minMax){
                    System.out.println("Resultado: \nPosição MINMAX: (" +(i+1)+", "+(j+1)+")");
                }
            }
        }

        

        teclado.close();
    }
}
