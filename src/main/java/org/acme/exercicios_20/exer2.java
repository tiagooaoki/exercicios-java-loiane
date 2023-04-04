package org.acme.exercicios_20;

import java.util.Random;

/*
  * 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e 
qual é o maior e o menor valor da coluna 7.
  */
public class exer2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matrix10 = new int[10][10];
        int maior5 = matrix10[4][0], menor5= maior5;
        int maior7 = matrix10[0][6], menor7= maior7;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix10[i][j] = gerador.nextInt(11);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
               
                System.out.print(matrix10[i][j] + " ");
                if (matrix10[4][j] > maior5) {
                    maior5 = matrix10[i][j];
                }
                if (matrix10[4][j] < menor5) {
                    menor5 = matrix10[i][j];
                }
                if (matrix10[i][6] > maior7) {
                    maior7 = matrix10[i][j];
                }
                if (matrix10[i][6] < menor7) {
                    menor7 = matrix10[i][j];
                }
            }
        }

        System.out.println("\nO maior numero na linha 5 eh "+ maior5 + " e o menor eh "+ menor5);
        System.out.println("O maior numero na coluna 7 eh "+ maior7 + " e o menor eh "+ menor7);
    }
}
