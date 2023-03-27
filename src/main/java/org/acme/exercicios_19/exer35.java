package org.acme.exercicios_19;

/*
 * 35.Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os divisores do 
respectivo elemento.
 */
public class exer35 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 };

        for (int i = 0; i < A.length; i++) {
            System.out.println("Numero "+ A[i]);
            System.out.println("eh multiplo dos seguintes numeros ");
            for (int j = 1; j <= A[i]; j++) {
                if(A[i]%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            
        }
    }
}
