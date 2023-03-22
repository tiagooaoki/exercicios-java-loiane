package org.acme.exercicios_19;

/*
 * 32.Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
imprima a tabuada de cada um dos elementos do vetor A
 */
public class exer32 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5};
        for (int i = 0; i < A.length; i++) {
            System.out.println("Tabuada de " +A[i]);
            for (int j = 1; j < 11; j++) {
                System.out.println(j+" x "+ A[i] + " = "+ A[i]*j);
            }
            System.out.println();
        }
    }
}
