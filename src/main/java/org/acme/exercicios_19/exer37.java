package org.acme.exercicios_19;

/*
 * 37.Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial 
do elemento correspondente em A.

 */
public class exer37 {
    public static void main(String[] args) {
        int[] A = new int[15];
        double[] B = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        for(int i=0;i<15;i++){
            A[i]=i+1;
            for(int j=A[i];j>0;j--){
                B[i] =  B[i]*j;
            }
        }
        for(double i:B){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}