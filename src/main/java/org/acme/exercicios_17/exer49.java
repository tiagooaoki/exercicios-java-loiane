package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 49.Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
Imprima no final a soma da série.
 */
public class exer49 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0, listaCheia = 0;
        double total=0;

        System.out.println("Digite quantos termos da Serie quer impresso.");
        s = scan.nextInt();
        int[] listaN = new int[s], listaM = new int[s];
        for (int i = 1; i < (s * 2.5); i++) {
            if (listaCheia == s) {
                break;
            }

            // add numero primo na listaM
            if (i % 2 == 1) {
                listaM[listaCheia] = i;
                listaCheia++;
            }

        }
        for (int i = 0; i < s; i++) {
            listaN[i] = (i + 1);
        }
        for (int i = 0; i < s; i++) {
            if (i == s - 1) {
                total = total + (listaN[i]/listaM[i]);
                System.out.print(listaN[i] + "/" + listaM[i]);
                continue;
            }
            total = total + (listaN[i]/listaM[i]);
            System.out.print(listaN[i] + "/" + listaM[i] + " + ");
        }

        System.out.println("\n S = "+ total);

         

    }
}
