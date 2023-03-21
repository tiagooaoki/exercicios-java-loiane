package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 50.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que 
calcule o valor de H com N termos.
 */
public class exer50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0, listaCheia = 0;
        double total = 0;
        System.out.println("Digite quantos termos da Serie quer impresso.");
        s = scan.nextInt();
        int[] listaM = new int[s];
        for (int i = 1; i <= s; i++) {
            if (listaCheia == s) {
                break;
            }

            listaM[listaCheia] = i;
            listaCheia++;

        }
        for (int i = 0; i < s; i++) {
            if (i == s - 1) {
                total = total + (1 / listaM[i]);
                System.out.print(1 + "/" + listaM[i]);
                continue;
            }
            total = total + (1 / listaM[i]);
            System.out.print(1 + "/" + listaM[i] + " + ");
        }

        System.out.println("\n H = " + total);
    }
}
