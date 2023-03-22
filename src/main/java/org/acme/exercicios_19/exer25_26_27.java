package org.acme.exercicios_19;

/*
 * 25.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 
quando Ai for ímpar.
26.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes 
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi; 
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 
quando Ai for menor que Bi.
27.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá 
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for 
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for 
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10. 
Sugestão: char B[10]
 */
public class exer25_26_27 {
    public static void main(String[] args) {
        int[] A = { 2, 3, 4, 5, 6, 6, 5, 4, 3, 2 }, B = new int[10], C = { 7, 9, 10, 11, 4, 4, 11, 10, 9, 7 },
                D = new int[10];
        char[] E = new char[10];
        for (int i = 0; i < B.length; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
            if (A[i] > C[i]) {
                D[i] = 1;
            }
            if (A[i] == C[i]) {
                D[i] = 0;
            } else {
                D[i] = -1;
            }if(C[i]<7){
                E[i]='a';
            }else if (C[i]==7) {
                E[i]='b';
            } else if (C[i]>7 && C[i]<10) {
                E[i]='c';
            } else if (C[i]==10) {
                E[i]='d';
            }else{
                E[i]='e';
            }

        }
        System.out.println("Vetor B");
        for (int i = 0; i < D.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor D");
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor E");
        for (int i = 0; i < D.length; i++) {
            System.out.print(E[i] + " ");
        }
    }
}
