package org.acme.exercicios_19;

/*
 * 36.Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que 
cada elemento do vetor A é formado pela potência de base 2 elevado 
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i
. Sugestão int A[11];
 */
public class exer36 {
    public static void main(String[] args) {
        int[] A = new int[11];
        double[] B = new double[11];

        for(int i=0;i<11;i++){
            A[i]=i;
            B[i]= Math.pow(2, i);
        }
        for(double i:B){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
