/*9. Faça um programa que carregue uma matriz 8 x 8 com números reias e mostre uma mensagem dizendo se
a matriz é ou não simétrica. Uma matriz é simétrica se para todas as posições da mesma, tem-se a relação
A[i][j] = A[j][i].*/

import java.util.*;
public class rafael09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] matriz = new int [3][3];

        System.out.println("9.Programa que identifica se a matriz é simetrica");

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+" :");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        teclado.close();

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                if (!(matriz [i][j] == matriz[j][i])){
                    System.out.println("Resultado: \nMatriz não simetrica");
                    return;
                }
            }
        }

        System.out.println("Resultado: \nMatriz é simetrica");
    }
}
