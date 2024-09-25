/*3. Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as
dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A
x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.*/

import java.util.*;
public class rafael03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        double [][] A = new double[3][4];
        int linhas, colunas;

        System.out.println("3. Progarama que calcula a o resultado da multipliação de duas matrizes A x B");

        System.out.println("Matriz A:");

        for (int i = 0 ; i < A.length; i++){
            for (int j = 0 ; j < A[i].length; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+": ");
                A [i][j] = teclado.nextDouble();
            }
        }

        System.out.print("Digite a quantidade de linhas da matriz B: ");
        linhas = teclado.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz B: ");
        colunas = teclado.nextInt();

        while (A[0].length != linhas){
            System.out.print("quantidade de linhas invalidade\nDigite novamente a qunatidade de linhas: ");;
            linhas = teclado.nextInt();
        }

        double [] [] B = new double [linhas][colunas];

        for (int i = 0 ; i <B.length; i++){
            for (int j = 0 ; j <B[i].length; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+": ");
                B [i][j] = teclado.nextDouble();
            }
        }

        double [][] AxB = new double [A.length][B[0].length];

        for (int i = 0 ; i < AxB.length ; i++){
            for (int j = 0 ; j < AxB[i].length; j++){
                for (int k  = 0 ; k < A[0].length ; k++){
                    AxB [i][j] = AxB[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultado: ");
        System.out.println("AxB: ");

        for (int i = 0 ; i < AxB.length ; i++){
            System.out.print(" | ");
            for ( int j = 0 ; j < AxB[i].length ; j++){
                System.out.print(AxB[i][j]+" | ");
            }
            System.out.print("\n");
        }        

        teclado.close();
    }
}
