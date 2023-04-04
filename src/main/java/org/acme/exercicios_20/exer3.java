package org.acme.exercicios_20;

import java.util.Random;

/*
 * 3. Capture do teclado valores para preenchimento de uma matriz M 
3x3. Após a captura imprima a matriz criada e encontre a 
quantidade de números pares, a quantidade de números ímpares.
 */
public class exer3 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matrix3 = new int[3][3];
        int par = 0, impar = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = gerador.nextInt(101);
                if(matrix3[i][j]%2==1){
                    impar++;
                } else{
                    par++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {

                System.out.print(matrix3[i][j] + " ");

            }
        }
        System.out.println();
        System.out.println("Quantidade de numero(s) par(es): " + par);
        System.out.println("Quantidade de numero(s) impar(es): " + impar);
    }

}
