/*4. A produção diária de uma fábrica é armazenada, semana a semana, em uma tabela com o seguinte
formato.*/

import java.util.*;
public class rafael04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int semana, dias;
        double soma, media;

        soma = 0;
        dias = 0;
        media = 0;

        System.out.println("4. Programa que armazena a produção de uma fabrica de semana a asemana");

        System.out.print("Digite a quantidade de semanas: ");
        semana = teclado.nextInt();

        double [][] matriz = new double [semana][7];

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

        System.out.println(soma+", "+dias+", "+media);




        teclado.close();
    }
}
