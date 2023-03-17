package org.acme.exercicios_19;

/*
 * 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou 
seja, B[i] = A[i].
2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho e com os elementos do vetor A multiplicados 
por 2, ou seja: B[i] = A[i] * 2.
 */
public class exer1_2 {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5};
        int[] vetorB = new int[5];
        int[] vetorC = {1,2,3,4,5,6,7,8};
        int[] vetorD = new int[8];

        vetorB = vetorA.clone();
        for (int i= 0; i< vetorC.length; i++){
            vetorD[i] = vetorC[i]*2;
        }

        System.out.println("VetorB ");
        for(int i : vetorB){
            System.out.println(i);
        }
        System.out.println("\nVetorD ");
        for(int i : vetorD){
            System.out.println(i);
        }
    }
}
