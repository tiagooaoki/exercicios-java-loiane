package org.acme.exercicios_19;

import java.util.Scanner;

/*
 * 41.Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, 
para pesquisar se um dado elemento X está armazenado em A.
42.Ler 10 elementos inteiros em um vetor A e colocá-los em ordem 
crescente e apresentar os elementos ordenados.
 */
public class exer41_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = { 25, 9, 3, 11, 5, 17, 47, 8, 36, 1 }, ordenado = new int[10];
        System.out.println("Digite qual numero esta procurando");
        int busca = scan.nextInt(), menor = A[0], cont = 0, menor2 = A[0],maior=A[0];
        boolean existe = false;

        for (int i = 0; i < A.length; i++) {
            if (busca == A[i]) {
                existe = true;
            }
        }

        if (existe)
            System.out.println("O elemento " + busca + " existe.");
        else
            System.out.println("O elemento " + busca + " nao existe.");

        for (int i = 1; i < A.length; i++) {
            if (A[i] < menor) {
                menor = A[i];
            }
            if (A[i] > maior) {
                maior = A[i];
            }
        }
        while (cont < A.length) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] <= menor2 && A[i] > menor) {
                    menor2 = A[i];
                }
            }
            ordenado[cont] = menor;
            menor = menor2;
            menor2=maior;
            cont++;
        }
        for (int i : ordenado) {
            System.out.print(i + " ");
        }
    }
}
