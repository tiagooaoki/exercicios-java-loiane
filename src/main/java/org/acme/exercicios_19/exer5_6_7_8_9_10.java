package org.acme.exercicios_19;

/*
 * 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o respectivo elemento de A multiplicado por sua posição (ou 
índice), ou seja:
B[i] = A[i] * i.
6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a soma dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] + B[i].
7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a subtração dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] – B[i].
8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a multiplicação dos 
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i].
9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C, onde cada elemento de C é a divisão dos respectivos 
elementos em A e B, ou seja:
C[i] = A[i] / float(B[i])
10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou 
seja: B[i] := A[i] % 2.

 */
public class exer5_6_7_8_9_10 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetorD = { 10,9,8,7,6,5,4,3,2,1 };
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int[] vetorE = new int[10];
        int[] vetorF = new int[10];
        float[] vetorG = new float[10];
        int[] vetorH = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorD[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorE[i] = vetorA[i] - vetorD[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorF[i] = vetorA[i] * vetorD[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorG[i] = vetorA[i] / (float)vetorD[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorH[i] = vetorA[i] %2;
        }



        //print
        System.out.println("VetorB ");
        for (int i : vetorB) {
            System.out.println(i);
        }
        System.out.println("vetorC ");
        for (int i : vetorC) {
            System.out.println(i);
        }
        System.out.println("vetorE ");
        for (int i : vetorE) {
            System.out.println(i);
        }
        System.out.println("vetorF ");
        for (int i : vetorF) {
            System.out.println(i);
        }
        System.out.println("vetorG ");
        for (float i : vetorG) {
            System.out.println(i);
        }
        System.out.println("vetorH ");
        for (int i : vetorH) {
            System.out.println(i);
        }

    }
}
