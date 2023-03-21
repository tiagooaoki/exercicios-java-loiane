package org.acme.exercicios_19;

import java.text.DecimalFormat;

/*
 * 20.Implementar um programa que obtenha a cotação do dólar (U$) em 
relação ao real (R$) e a seguir armazene em vetor A com 20 
elementos as seguintes conversões:
21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */
public class exer20 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        double dolar = 5.05;
        double[] lista = new double[20];

        for(int i = 0; i< 20 ;i++){
            lista[i] = dolar*(i+1);
        }
        for(int i = 0; i< 20 ;i++){
        System.out.println("US$ "+df.format(i+1) +" equivale a R$ " + df.format(lista[i]));
        }

    }
}
