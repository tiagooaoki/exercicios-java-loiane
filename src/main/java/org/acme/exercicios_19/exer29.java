package org.acme.exercicios_19;

/*
 * 29.Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, 
sendo este a junção dos dois outros vetores. Os primeiros 10 
elementos de C deverão receber os elementos de A e os últimos 
elementos C deverão receber os elementos de B. Desta forma, C 
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
 */
public class exer29 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 },
        B = new int[20],
        C = { 7, 9, 10, 11, 4, 4, 11, 10, 9, 7 };

        for (int i = 0; i < B.length; i++) {
            if(i<10){
                B[i]=A[i];
            }
            if(i>9){
                B[i]=C[i-10];
            }
        }

        for(int i : B){
            System.out.print(i+" ");
        }
    }
}
