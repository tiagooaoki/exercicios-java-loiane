package org.acme.exercicios_17;

import java.util.Scanner;

/*
44.Em uma eleição presidencial existem quatro candidatos. Os votos são 
informados por meio de código. Os códigos utilizados são:
o 1, 2, 3, 4 - Votos para os respectivos candidatos 
o (você deve montar a tabela ex: 1 - Jose/ 2- João/etc) 
o 5 - Voto Nulo 
o 6 - Voto em Branco

Faça um programa que calcule e mostre:
o O total de votos para cada candidato;
o O total de votos nulos;
o O total de votos em branco;
o A percentagem de votos nulos sobre o total de votos;
o A percentagem de votos em branco sobre o total de votos. Para 
finalizar o conjunto de votos tem-se o valor zero.
*/
public class exer44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = -1, cont = 0, v1=0,v2=0,v3=0,v4=0,v5=0,v6=0;
        int[] votos = new int[100];
        while (n != 0) {
            System.out.println("Insira o codigo das opcoes a seguir");
            System.out.println("1 - Jose" +
                    ", 2 - Joao" +
                    ", 3 - Maria" +
                    ", 4 - Marta" +
                    ", 5 - Voto nulo" +
                    ", 6 - Voto em branco");
            n = scan.nextInt();
            if (n > 0 && n < 7) {
                votos[cont]=n;
                cont++;
            }
        }
            for(int i=0; i < votos.length;i++){
                if(votos[i] == 1) v1++;
                if(votos[i] == 2) v2++;
                if(votos[i] == 3) v3++;
                if(votos[i] == 4) v4++;
                if(votos[i] == 5) v5++;
                if(votos[i] == 6) v6++;

            }
            System.out.println("Quantidade de votos cada candidato teve: "+
                    "\n 1 - Jose -> " + v1+
                    "\n 2 - Joao -> " +v2+
                    "\n 3 - Maria -> " +v3+
                    "\n 4 - Marta -> " +v4+
                    "\n 5 - Voto nulo -> " + v5+
                    "\n 6 - Voto em branco -> "+ v6);
                    System.out.println(cont);
                    System.out.println("A percentagem de votos nulos sobre o total de votos "+(double)v5/(double)cont);
                    System.out.println("A percentagem de votos brancos sobre o total de votos "+(double)v6/(double)cont);
        


    }
}
