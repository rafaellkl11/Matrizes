/*3. Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as
dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A
x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.*/

import java.util.*;
public class rafael03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        double [][] A = new double[3][4];
        int linhas, colunas;

        System.out.println("3. Progarama que calcula a o resultado da multipliação de duas matrizes");
        System.out.print("Digite a quantidade de linhas da matriz B: ");
        linhas = teclado.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz B: ");
        colunas = teclado.nextInt();

        while (A[0].length != linhas){
            System.out.print("quantidade de linhas invalidade\nDigite novamente a qunatidade de linhas: ");;
            linhas = teclado.nextInt();
        }


        teclado.close();
    }
}
