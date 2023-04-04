package org.acme.exercicios_20;

import java.util.Random;

/*
  * 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição 
(linha, coluna).
  */
public class exer1 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matrix4 = new int[4][4];
        int maior = matrix4[0][0], indexI = 0, indexJ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix4[i][j] = gerador.nextInt(11);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
               
                System.out.print(matrix4[i][j] + " ");
                if (matrix4[i][j] > maior) {
                    maior = matrix4[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.println("\nO maior numero eh "+ maior + " na posicao [][] "+ indexI + " "+ indexJ);

    }
}
