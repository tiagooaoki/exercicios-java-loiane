package org.acme.exercicios_19;

/*
 * 30.Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo 
que nos vetor B e C serão armazenados o valores pares e ímpares de 
A, respectivamente.

31.Ler um vetor A com 20 elementos. Separar os elementos pares e 
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início 
do vetor B armazene os elementos pares de A e nas posições 
restantes do vetor B armazene os elementos de A que são ímpares.
 */
public class exer30_31 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47,7, 9, 10, 11, 4, 4, 11, 10, 9, 8 },
        B = new int[10],
        C = new int[10];
        int contB=0,contC=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                B[contB]=A[i];
                contB++;
            }
            if(A[i]%2==1){
                C[contC]=A[i];
                contC++;
            }
        }
        System.out.println("Array B - pares");
        for(int i : B){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Array C - impares");
        for(int i : C){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Exercicio 31");
        //exerc 31
        int[] D = new int[20];
        int cont=0;
        for (int i = 0; i < D.length; i++) {
            if(A[i]%2==0){
                D[cont]=A[i];
                cont++;
            }
        }
        for (int i = 0; i < D.length; i++) {
            if(A[i]%2==1){
                D[cont]=A[i];
                cont++;
            }
        }
        for(int i : D){
            System.out.print(i+" ");
        }
    }
}
