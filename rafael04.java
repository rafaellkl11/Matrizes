/*4. A produção diária de uma fábrica é armazenada, semana a semana, em uma tabela com o seguinte
formato.*/

import java.util.*;
public class rafael04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int semana, dias, diasAcimaMed;
        double soma, media, minProddia;

        soma = 0;
        dias = 0;
        media = 0;
        diasAcimaMed = 0;
        minProddia = 0;

        System.out.println("4. Programa que armazena a produção de uma fabrica de semana a asemana");

        System.out.print("Digite a quantidade de semanas: ");
        semana = teclado.nextInt();

        double [][] matriz = new double [semana][7];
        double [][] MinProd = new double [semana][2];

        for (int i = 0 ; i < matriz.length ; i++){
            for ( int j = 0; j < matriz[i].length ; j++){
                System.out.print("Digite a produção da semana "+(i+1)+" dia "+(j+1)+" : ");
                matriz [i][j] = teclado.nextDouble();
                soma = soma + matriz[i][j];
            }
        }

        for (int i = 0 ; i < matriz.length ; i++){
            System.out.print(" | ");
            for ( int j = 0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.print("\n");
        }  

        dias = matriz.length * matriz[0].length;
        media  = soma / dias;

        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                if (matriz[i][j] > media){
                    diasAcimaMed++;
                }
            }
        }

        for (int i = 0 ; i < MinProd.length ; i++){
            for (int j = 0 ;j < MinProd[i].length ; j++){
                if (j == 0){
                    MinProd[i][j] = i+1;
                }
                else if (j == 1){
                    minProddia = matriz [i][j];
                    for (int k = 0 ; k < matriz[i].length; k++){
                        if (minProddia > matriz[i][k]){
                            minProddia = matriz[i][k];
                            MinProd[i][j] = k+1;
                        }
                    }
                }
            }
        }

        System.out.println("Resultado: ");
        System.out.println("Produção média: "+media);
        System.out.println("Número de dias com produção acima da média: "+diasAcimaMed);
        System.out.println("\nIndicação dos dias de mínima produção:");
        System.out.println("Semana | Dia");
        for (int i = 0 ; i < MinProd.length ; i++){
            System.out.print(" | ");
            for ( int j = 0 ; j < MinProd[i].length ; j++){
                System.out.print(MinProd[i][j]+" | ");
            }
            System.out.print("\n");
        }  

        teclado.close();
    }
}
