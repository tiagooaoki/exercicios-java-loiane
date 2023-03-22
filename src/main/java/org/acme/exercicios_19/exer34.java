package org.acme.exercicios_19;

/*
 * 34.Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os pares de 0 
até o respectivo elemento.
 */
public class exer34 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 };
        for (int i = 0; i < A.length; i++) {
            System.out.println("Numero "+ A[i]);
            for (int j = A[i]; j > 1; j--) {
                if(j%2==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            
        }
    }
}
