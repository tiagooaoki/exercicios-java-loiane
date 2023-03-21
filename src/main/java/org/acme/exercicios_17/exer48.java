package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 48.Faça um programa que peça um numero inteiro positivo e em seguida mostre este 
numero invertido.
o Exemplo:
12376489 
=> 98467321
 */
public class exer48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0, cont=0;
        String stringN="", inverso="";
        System.out.println("Digite um numero inteiro positivo");
        n = scan.nextInt();
        if(n >0){
            stringN = String.valueOf(n);
            for(int i=stringN.length()-1; i>=0;i--){
                inverso = inverso + stringN.charAt(i);
            }
            System.out.println(inverso);
        }else{
            System.out.println("O numero não é inteiro positivo.");
        }
    }
}
