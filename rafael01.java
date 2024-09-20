/**/

import java.util.*;
public class rafael01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] matriz = new double[2][2];
        double [][] matrizResult = new double[2][2];
        double maiorNum, resultado;

        maiorNum = 0;

        System.out.println("1. Programa que recebe uma matriz e multiplica os valores pelo maior elemento");

        for (int i = 0 ; i < matriz.length; i++){
            for (int j = 0 ; j < matriz[i].length; j++){
                System.out.print("Digite o número da linha "+(i+1)+" coluna "+(j+1)+": ");
                matriz[i][j] = teclado.nextDouble();
                if (matriz[i][j] > maiorNum){
                    maiorNum = matriz[i][j];
                }
            }
        }

        for(int i = 0 ; i < matrizResult.length ; i++){
            for (int j = 0 ; j < matrizResult[i].length ; j++){
                resultado = matriz[i][j] * maiorNum;
                matrizResult[i][j] = resultado;
            }
        }

        System.out.println("Resultado: ");

        for (int i = 0 ; i < matrizResult.length ; i++){
            System.out.print("|");
            for ( int j = 0 ; j < matrizResult[i].length ; j++){
                System.out.print(matrizResult[i][j]+"|");
            }
            System.out.print("\n");
        }


        teclado.close();
    }
}