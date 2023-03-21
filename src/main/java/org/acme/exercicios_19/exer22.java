package org.acme.exercicios_19;

/*
 * 22.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.
 */
public class exer22 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int um = 0;
        for(int i = 0 ; i <10; i++){
            A[i] = (int)Math.round(Math.random() * 1);
            if(A[i]==1) um++;
            
        }

        for(int i = 0 ; i <10; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        System.out.println((um/(float)10)*100 + "% da lista eh composta por numero 1.");
            
    }
}
