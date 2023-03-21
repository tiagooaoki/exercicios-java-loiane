package org.acme.exercicios_17;

import java.util.Scanner;

/*
41.Faça um programa que receba o valor de uma dívida e mostre uma 
tabela com os seguintes dados: valor da dívida, valor dos juros, 
quantidade de parcelas e valor da parcela.
o Os juros e a quantidade de parcelas seguem a tabela abaixo
*/
public class exer41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double divida=0, juros=0, valorParcela=0;
        System.out.println("Insira valor da divida.");
        divida = scan.nextDouble();
        System.out.println("Valor da Dívida, Valor dos Juros, Quantidade de Parcelas, Valor da Parcela");
        System.out.println(divida + "          " + "0    " + "          " + "1          " + " R$ " + divida );
        System.out.println(divida + "          " + divida*0.1 + "          " + "3          " + " R$ " + divida*1.1 );
        System.out.println(divida + "          " + divida*0.15 + "          " + "6          " + " R$ " + divida*1.15 );
        System.out.println(divida + "          " + divida*0.2 + "          " + "9          " + " R$ " + divida*1.2 );
        System.out.println(divida + "          " + divida*0.25 + "          " + "12          " + " R$ " + divida*1.25 );

    }
}
