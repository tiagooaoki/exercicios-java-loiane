package org.acme.exercicios_19;

/*
 * 39.Criar dois vetores A e B cada um com 10 elementos inteiros. 
Desenvolver um programa que realize a interseção dos vetores A e B 
para produzir um vetor C. Interseção de conjuntos = todos os 
elementos que existem em A e também existem em B.
40.Criar dois vetores A e B cada um com 10 elementos inteiros. 
Desenvolver um programa que crie um vetor C que é a diferença dos 
conjuntos formados pelos elementos dos vetores A e B. Diferença de 
conjuntos = todos os elementos do conjunto A que não existem no 
conjunto B.
 */
public class exer39_40 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 };
        int[] B = { 47, 9, 3, 11, 5, 13, 14, 8, 36, 1 };
        int[] intersecao = new int[10], diferenca = new int[10];
        int contI=0, contD=0;
        

        for (int i = 0; i < A.length; i++) {
            boolean diferente=true;
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]){
                    intersecao[contI]=A[i];
                    contI++;
                    diferente=false;
                }               
            }        
            if(diferente){
                diferenca[contD]=A[i];
                contD++;
            }    
        }
        for (int i = 0; i < B.length; i++) {
            boolean diferente=true;
            for (int j = 0; j < A.length; j++) {
                if(B[i] == A[j]){
                    diferente=false;
                }               
            }        
            if(diferente){
                diferenca[contD]=B[i];
                contD++;
            }    
        }
        System.out.println("Intersecao: ");
        for(int i = 0; i < contI; i++){
            System.out.print(intersecao[i] + " ");
        }
        System.out.println("\nExclusivos");
        for(int i = 0; i < contD; i++){
            System.out.print(diferenca[i] + " ");
        }
        System.out.println();

    }
}
