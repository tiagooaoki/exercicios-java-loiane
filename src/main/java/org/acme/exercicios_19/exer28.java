package org.acme.exercicios_19;

/*
 * 28.Ler um vetor A com 10 elementos e construir um vetor B de mesmo 
tipo e tamanho e com os mesmos elementos de A, sendo que estes 
deverão estar invertidos, ou seja, o primeiro elemento de A passa a 
ser o último de B, o segundo elemento de A passa a ser o penúltimo 
de B e assim por diante.
 */
public class exer28 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 },
        B = new int[10];
        int cont=B.length-1;

        for (int i = 0; i < B.length; i++) {
            B[i] = A[cont];
            cont--;
        }
        for(int i : B){
            System.out.print(i+" ");
        }
    }
}
