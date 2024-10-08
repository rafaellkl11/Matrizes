/*11. Considere n cidades numeradas de 0 a n-1 que estão interligadas por uma série de estradas de mão única.
As ligações entre as cidades são representadas pelos elementos de uma matriz quadrada Lnxn, cujos
elementos lij assumem o valor 1 ou 0, conforme exista ou não estrada direta que saia da cidade i e chegue
à cidade j. Assim, os elementos da linha i indicam as estradas que saem da cidade i, e os elementos da
coluna j indicam as estradas que chegam à cidade j. Por convenção lii = 1. A figura abaixo um exemplo
para n = 4.

a) Dada uma cidade k, determine quantas estradas saem de k e quantas cidades chegam à k.
b) Qual das cidades possuem maior número de estradas chegando?
c) Encontre, se existirem, as cidades isoladas. Ou seja, aquelas em que não chegam nem saem estradas.
d) Dada uma determinada rota de m cidades, representada por um vetor de inteiros cujos valores estão
entre 0 e n-1, tal como exercício anterior, verifique se é possível realizar tal rota. No exemplo anterior,
a rota (m = 5) 2 3 2 1 0 é impossível; já a rota (m = 6) 0 1 2 3 2 0 é possível.*/

import java.util.*;;
public class rafael11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cidades, soma, maiorCheg, cidadeMaiorcheg, rotacidades;
        
        soma = 0 ;
        maiorCheg = 0;
        cidadeMaiorcheg = 0;
        rotacidades = 0;

        System.out.println("11. Programa que calcula as estradas de n cidades");

        System.out.print("Digite a quantidade de cidades: ");
        cidades = teclado.nextInt();

        int [][] matriz = new int [cidades][cidades];
        int [] vetorCheg = new int [cidades];
        int [] vetorSaid = new int [cidades];
        
        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("A cidade "+(i)+" vai para a cidade "+(j)+" digite 1 para sim e 0 para não:");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Resultado: ");

        for (int i = 0 ; i < matriz.length ; i++){
            System.out.print("Estradas que saem de "+i+": ");
            for(int j = 0 ; j < matriz[i].length ; j++){
                soma = soma + matriz[i][j];
            }
            vetorSaid[i] = soma;
            System.out.println(soma-1);
            soma = 0;
        }
        System.out.println("");

        for (int i = 0 ; i < matriz.length ; i++){
            System.out.print("Estradas que vão para "+i+": ");
            for(int j = 0 ; j < matriz[i].length ; j++){
                soma = soma + matriz[j][i];
            }
            vetorCheg[i] = soma;
            System.out.println(soma-1);
            soma = 0;
        }

        for(int i = 0 ; i < vetorCheg.length ; i++){
            if (vetorCheg[i] > maiorCheg){
                maiorCheg = vetorCheg[i];
                cidadeMaiorcheg = i;
            }
        }

        System.out.println("\nCidade com maior n° de estradas chegando: "+cidadeMaiorcheg);

        System.out.print("Cidades isoladas: ");
        for (int i = 0 ; i < vetorCheg.length ; i++){
            if (vetorCheg[i] == 1 && vetorSaid[i] == 1){
                System.out.print(i+", ");
            }
        }
        System.out.println("");

        System.out.print("Digite a quantidades que cidades que vão passar: ");
        rotacidades = teclado.nextInt();
        int [] rota = new int [rotacidades];
        
        System.out.print("Digite a rota: ");
        for(int i = 0 ; i < rota.length ; i++){
            rota[i] = teclado.nextInt();
        }

        for (int i = 0 ; i < rota.length-1 ; i++){
            if (matriz[rota[i]][rota[i+1]] == 0){
                System.out.println("Não e possivel traçar essa rota.");
                teclado.close();
                return;
            }
        }

        System.out.println("É possivel traçar essa rota;");
        
        teclado.close();
    }
}
