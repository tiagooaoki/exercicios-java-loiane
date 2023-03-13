package org.acme.exercicios_17;

import java.util.Scanner;

/*
39.Faça um programa que leia dez conjuntos de dois valores, o primeiro 
representando o número do aluno e o segundo representando a sua 
altura em centímetros. Encontre o aluno mais alto e o mais baixo. 
Mostre o número do aluno mais alto e o número do aluno mais baixo, 
junto com suas alturas.
*/
public class exer39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0, altura = 0, contador = 0;
        int[] listaAluno = new int[4], listaAltura = new int[4];
        while (contador < 4) {
            System.out.println("insira o codigo (numero inteiro) do aluno");
            numero = scan.nextInt();
            listaAluno[contador] = numero;
            System.out.println("insira a altura em cm do aluno");
            altura = scan.nextInt();
            listaAltura[contador] = altura;
            contador++;
        }
        int min = listaAltura[0], max = min, indMin = 0, indMax = 0;
        for (int i = 1; i < 4; i++) {
            if (listaAltura[i] < min) {
                min = listaAltura[i];
                indMin = i;
            }
            if (listaAltura[i] > max) {
                max = listaAltura[i];
                indMax = i;
            }
        }
        System.out.println("O aluno mais alto eh: " + listaAluno[indMax] + ", mede " + max + " cm.");
        System.out.println("O aluno mais baixo eh: " + listaAluno[indMin] + ", mede " + min + " cm.");

    }

}
