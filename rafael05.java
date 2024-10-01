/*5. Faça um programa que:
 Receba as notas de 10 alunos em cinco provas diferentes e armazene-as em uma matriz 10 x 5.
 Receba o nome dos 10 alunos e armazene-os em um vetor de string com 10 posições
 Calcule e exiba o nome do aluno, a média das notas do mesmo e a situação:
o Aprovado: média maior ou igual a 7
o Reprovado: média menor que 4
o Exame Especial: média entre 4 e 7*/

import java.util.*;

public class rafael05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] nomes = new String [10];
        double [][] matriz = new double[nomes.length][5];
        double[] medias = new double[nomes.length];
        double soma, media;

        soma = 0;
        media = 0;

        System.out.println("5. Programa que calcula as notas das provas de 10 aluno e imprime se o aluno foi reprovado");

        for (int  i = 0 ; i < matriz.length ; i++ ){

            System.out.print("Digite o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            for (int j = 0 ; j < matriz[i].length ; j++){
                System.out.print("Digite a nota da prova "+(j+1)+" do aluno "+nomes[i]+": ");
                matriz[i][j] = teclado.nextDouble();
            }
            teclado.nextLine();
        }

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                soma =  soma + matriz[i][j];
            }

            media = soma / matriz[i].length;

            medias[i] = media;
            media = 0;
            soma = 0;
        }

        System.out.println("Resultado: ");

        for (int i = 0 ; i < nomes.length ; i++){
            System.out.println("Aluno: "+nomes[i]);
            System.out.println("Média: "+medias[i]);
            if (medias[i] >= 7){
                System.out.println("Situação: Aprovado");
            }
            else if (medias[i] < 4){
                System.out.println("Situação:  Reprovado");
            }
            else {
                System.out.println("Situação: Exame Especial");
            }
            System.out.println("");
        }

        teclado.close();
    }
}
