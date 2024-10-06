/*10. Os elementos aij de uma matriz An x n representam os custos de transporte da cidade i para a cidade j. O
caminhão de uma empresa de logística deve passar exatamente uma vez por cada uma da n cidades.
Sabendo que, uma rota é representada por um vetor de n posições, em que cada posição representa a
cidade visitada, você deve implementar um algoritmo que calcule o custo da rota de um caminhão da
empresa. Note que, a rota e a matriz de custo devem ser fornecidas pelo usuário.
Exemplo: Considere 4 cidades em que os custos de transporte entre as mesmas são representados pela
matriz de custo M abaixo. Considere ainda uma rota denotada pelo vetor = [ 3 1 0 2] significando que
o caminhão parte da cidade 3 com destino à cidade 1; sai de 1 e vai para 0; e por fim parte da cidade 0
para a cidade 2. Portanto, o custo de transporte dessa rota é: M[3][1] + M[1][0] + M[0][2] = 19 + 15 + 16
= 50 unidades.

Matriz de custos M = [0 10 16 20
15 0 25 18
12 14 0 20
20 19 35 0]*/

import java.util.*;
public class rafael10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cidades, custo;

        custo = 0;

        System.out.println("10.Programa que calcula o custo de transporte de um caminhão");

        System.out.print("Digite a quantidade de cidades: ");
        cidades = teclado.nextInt();

        int [][] matriz = new int [cidades][cidades];
        int [] rota = new int [cidades];

        for (int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("Digite o preço da cidade "+(i)+" para a cidade "+(j)+": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.print("Digite o a rota: ");
        for (int i = 0 ; i < rota.length ; i++){
            rota[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < rota.length-1 ; i++){
            custo = custo + matriz[rota[i]][rota[i+1]];
        }

        System.out.println("Resultado: ");
        System.out.println("Preço: R$"+custo);

        teclado.close();
    }
}