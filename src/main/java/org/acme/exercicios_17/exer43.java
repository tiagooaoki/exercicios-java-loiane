package org.acme.exercicios_17;

import java.util.Scanner;

/*
43.Faça um programa que leia o código dos itens pedidos e as 
quantidades desejadas. Calcule e mostre o valor a ser pago por 
item (preço * quantidade) e o total geral do pedido. Considere 
que o cliente deve informar quando o pedido deve ser 
encerrado.
*/
public class exer43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c100 = 0, c101 = 0, c102 = 0, c103 = 0, c104 = 0, c105 = 0, cod = 1;
        double total = 0;
        while (cod != 0) {
            System.out.println("Faça seu pedido inserindo o codigo do item.(Para sair insira 0)" +
                    "\n Especificação Código Preço " +
                    "\n Cachorro Quente 100 R$ 1,20 " +
                    "\n Bauru Simples 101 R$ 1,30 " +
                    "\n Bauru com ovo 102 R$ 1,50 " +
                    "\n Hambúrguer 103 R$ 1,20 " +
                    "\n Cheeseburguer 104 R$ 1,30 " +
                    "\n Refrigerante 105 R$ 1,00 ");
            cod = scan.nextInt();
            if (cod == 0)
                continue;
            switch (cod) {
                case 100:
                    c100++;
                    break;
                case 101:
                    c101++;
                    break;
                case 102:
                    c102++;
                    break;
                case 103:
                    c103++;
                    break;
                case 104:
                    c104++;
                    break;
                case 105:
                    c105++;
                    break;
                default:
                    break;
            }

        }

        if (c100 > 0) {
            System.out.println("Quantidade de Cachorro Quente: " + c100 + " x R$ 1,20 = R$ " + c100 * 1.2);
            total = total + c100 * 1.2;
        }
        if (c101 > 0) {
            System.out.println(" Quantidade de Bauru Simples 101 R$ 1,30 " + c101 + " x R$ 1,30 = R$ " + c101 * 1.3);
            total = total + c101 * 1.3;
        }
        if (c102 > 0) {
            System.out.println(" Quantidade de Bauru com ovo 102 R$ 1,50 " + c102 + " x R$ 1,50 = R$ " + c102 * 1.5);
            total = total + c102 * 1.5;
        }
        if (c103 > 0) {
            System.out.println(" Quantidade de Hambúrguer 103 R$ 1,20 " + c103 + " x R$ 1,20 = R$ " + c103 * 1.2);
            total = total + c103 * 1.2;
        }
        if (c104 > 0) {
            System.out.println(" Quantidade de Cheeseburguer 104 R$ 1,30 " + c104 + " x R$ 1,30 = R$ " + c104 * 1.3);
            total = total + c104 * 1.3;
        }
        if (c105 > 0) {
            System.out.println(" Quantidade de Refrigerante 105 R$ 1,00" + c105 + " x R$ 1,00 = R$ " + c105 * 1);
            total = total + c105 * 1;
        }
        System.out.println("Total do pedido: R$ " + total);
    }
}
