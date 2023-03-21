package org.acme.exercicios_17;

import java.util.Scanner;

/*
38.Um funcionário de uma empresa recebe aumento salarial anualmente: 
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de 
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre 
correspondem ao dobro do percentual do ano anterior. Faça um 
programa que determine o salário atual desse funcionário. Após 
concluir isto, altere o programa permitindo que o usuário digite o 
salário inicial do funcionário.
*/
public class exer38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario=0, ajuste=0.015;
        System.out.println("insira o salario.");
        salario = scan.nextDouble();
        System.out.println("insira o ano para calcular o valor atual do salario (1997 para frente).");
        int ano = scan.nextInt();
        if(ano < 1996) System.out.println("Ano deve ser maior que 1995");
        for(int i=1996; i<ano; i++){
            salario = salario*(1+ajuste);
            ajuste = ajuste *2;
            System.out.println("salario em " + i + " , ajustado em "+ ajuste*100 + "%" + ", eh: R$ " + salario);
        }
        System.out.println("salario em " + ano + " eh: R$ " + salario);

        
    }
    
}
