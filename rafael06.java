/*6. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando
o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do
conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na análise foram coletadas
20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das
mesmas. Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie
seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção. Além disso,
exiba, se for o caso, qual das linhas de produção precisa ser revisada.*/

import java.util.*;
public class rafael06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [][] prod = new double[6][20];
        double [] media = new double [prod.length];
        double [] variacaoVetor = new double [prod.length];
        double variacaoSoma, soma;

        soma = 0;
        variacaoSoma =0;

        System.out.println("6. Programa que calcula o a variação de uma amostra em relação a média.");

        for (int i = 0 ; i < prod.length ; i++){
            for (int j = 0 ; j < prod[i].length ; j++){
                System.out.print("Digite a quantidade da lata "+(j+1)+" linha "+(i+1)+": ");
                prod[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 0 ; i < prod.length ; i++){
            for (int j = 0 ; j < prod[i].length ; j++){
                soma = soma + prod[i][j];
            }
            media[i] = soma / prod[i].length;
            soma = 0;
        }

        for ( int i = 0 ; i < prod.length ; i++){
            for ( int j = 0 ; j < prod[i].length; j++){
                variacaoSoma = variacaoSoma + Math.pow((prod[i][j] - media[i]), 2);
            }
            variacaoVetor[i] = Math.sqrt(variacaoSoma / (prod[0].length - 1));
            variacaoSoma = 0;
        }

        System.out.println("Resultado: ");

        for (int i = 0 ; i < media.length ; i++){
            if (media[i]+variacaoVetor[i] <= (390+5) && (media[i] - variacaoVetor[i]) >= (390-5)){
                System.out.println("lote "+(i+1)+ " está dentro dos padrões");
            }
            else{
                System.out.println("lote " +(i+1)+ " está fora dos padrões");
            }
        }
        teclado.close();    
    }
}
