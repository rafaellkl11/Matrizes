/*8. Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna
houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário,
informe se a mesma é ou não uma matriz permutação.
Ex.: Matriz permutação: [0 0 0 1
1 0 0 0
0 1 0 0
0 0 1 0 ]*/

import java.util.*;
public class rafael08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int linhas, prColuna;

        prColuna = 0;

        System.out.println("8. Programa que identifica se a matriz é uma matriz de permutação");

        System.out.print("Digite a quantidade de linhas da matriz: ");
        linhas = teclado.nextInt();

        

        int [][] matriz = new int[linhas][linhas];

        for (int i = 0 ; i < matriz.length ; i++){
            for ( int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("Digite o valor da linha "+(i+1)+" coluna "+(j+1)+" :");
                matriz[i][j] = teclado.nextInt();
            }
        }
        teclado.close();
        for (int i = 0 ; i < matriz.length ; i++){
            for ( int j = 0 ; j < matriz[i].length ; j++){
                if (matriz[i][j] == 1){
                    prColuna = j+1;
                    i++;
                    if (prColuna > matriz.length-1){
                        prColuna=0;
                    }
                    break;
                }
            }
            if(matriz[i][prColuna] == 1){
                prColuna = prColuna+1;
                if (prColuna > (matriz.length-1)){
                    prColuna = 0;
                }
            }
            else {
                System.out.println("Não é uma matriz permutação");
                return;
            }
        }

        System.out.println("Resultado: \nÉ uma matriz permutação");
    }
}
