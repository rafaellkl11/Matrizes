/*12. Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns e
coloque esses dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de
estocagem de uma unidade de cada produto, calcule e mostre:
a) Quantidade de itens armazenados em cada armazém;
b) Qual armazém possui maior estoque do produto 2;
c) Qual armazém possui menor estoque;
d) Qual armazém possui maior custo de estocagem.*/

import java.util.*;
public class rafael12 {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int [][] estoque = new int [5][3];
        int [] totalEstoque = new int [4];
        int soma, index, maiorProd2, menorEstoque, maiorCusto;

        soma = 0;
        index = 0;
        maiorProd2 = 0;
        maiorCusto = 0;

        System.out.println("12. Programa que simula um estoque");

        for (int i = 0 ; i < estoque[0].length ; i++){
            System.out.print("Digite o valor unitario do produto "+(i+1)+": ");
            estoque [estoque.length-1][i] = teclado.nextInt();
        }

        for (int i = 0 ; i < (estoque.length-1) ; i++){
            for (int j = 0 ; j < estoque[i].length ; j++){
                System.out.print("Digite a quantida do produto "+(j+1)+" no estoque "+(i+1)+": ");
                estoque[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0 ; i < totalEstoque.length ; i++){
            for (int j = 0 ; j < estoque[0].length ; j++){
                soma = soma + estoque[i][j];
            }
            totalEstoque[i] = soma;
            soma = 0;
        }

        System.out.println("Resultado: ");

        for (int i = 0 ; i < totalEstoque.length ; i++){
            System.out.println("Quantidade de produtos no estoque "+(i+1)+": "+totalEstoque[i]);
        }

        for (int i = 0 ; i < estoque.length-1 ; i++){
            if (estoque[i][1] > maiorProd2){
                maiorProd2 = estoque[i][1];
                index = i;
            }
        }
        
        System.out.print("Estoque com maior quantidade do produto 2: "+(index+1));

        index = 0;
        menorEstoque = totalEstoque[0];
        for (int i = 0 ; i < totalEstoque.length ; i++){
            if (totalEstoque[i]<menorEstoque){
                menorEstoque = totalEstoque[i];
                index = i;
            }
        }

        System.out.println("\nEstoque com o menor n° de produtos: "+(index+1));
        
        int [] vetorCusto = new int [estoque.length-1];

        soma = 0;

        for (int i = 0 ; i < vetorCusto.length ; i++){
            for (int j = 0 ; j < estoque[0].length ; j++){
                soma = soma + estoque[i][j] * estoque[4][j];
            }
            vetorCusto[i] = soma;
            soma = 0;
        }

        for (int i = 0 ; i < vetorCusto.length ; i++){
            if (vetorCusto[i] > maiorCusto){
                maiorCusto = vetorCusto[i];
                index = i;
            }
        }

        System.out.println("Estoque com maior maior custo: "+(index+1));

        teclado.close();
    }
}