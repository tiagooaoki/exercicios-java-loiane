package org.acme.exercicios_19;

/*
 * 33.Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e uma mensagem indicando se o 
respectivo elemento é um número primo ou não.
 */
public class exer33 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 };
        for (int i = 0; i < A.length; i++) {
            int cont = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0)
                    cont++;
            }

            if (cont == 2) {
                System.out.println(A[i] + " EH PRIMO");
            } else if (A[i] == 1) {
                System.out.println(A[i] + " EH PRIMO");
            } else {
                System.out.println(A[i] + " NAO EH PRIMO");
            }
        }
    }
}
