package org.acme.exercicios_17;

import java.util.Scanner;

/*
42.Faça um programa que leia uma quantidade indeterminada de 
números positivos e conte quantos deles estão nos seguintes 
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados 
deverá terminar quando for lido um número negativo
*/
public class exer42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grupo1=0,grupo2=0, grupo3=0, grupo4=0, n=0;
        while(n>-1){
            System.out.println("Insira um numero inteiro positivo. " +
            "(Para encerrar insira um numero abaixo de 0)");
            n = scan.nextInt();
            if(n <0) continue;
            if(n>= 0 && n<=25){
                grupo1++;
            }
            if(n>= 26 && n<=50){
                grupo2++;
            }
            if(n>= 51 && n<=75){
                grupo3++;
            }
            if(n>= 76 && n<=100){
                grupo4++;
            }
        }
        System.out.println("Quantidade de numero entre [0-25]: "+ grupo1);
        System.out.println("Quantidade de numero entre [26-50]: "+ grupo2);
        System.out.println("Quantidade de numero entre [51-75]: "+ grupo3);
        System.out.println("Quantidade de numero entre [76-100]: "+ grupo4);


    }
}
