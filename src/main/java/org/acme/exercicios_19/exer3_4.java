package org.acme.exercicios_19;

/*
 *  3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
    4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]). 
 */
public class exer3_4 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] vetorB = new int[15];
        double[] vetorC = new double[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("VetorB ");
        for (int i : vetorB) {
            System.out.println(i);
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("VetorC ");
        for (double i : vetorC) {
            System.out.println(i);
        }


    }

}
