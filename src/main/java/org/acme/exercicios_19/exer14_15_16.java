package org.acme.exercicios_19;

/*
 * 14.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a média aritmética simples dos elementos 
ímpares armazenados neste vetor.
15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
que defina o percentual de elementos pares e ímpares, 
respectivamente, armazenados neste vetor.
16.Criar um vetor A com 10 elementos inteiros. Escrever um programa 
que calcule e escreva: a) a soma de elementos armazenados neste 
vetor que são inferiores a 15; b) a quantidade de elementos 
armazenados no vetor que são iguais a 15; e c) a média dos 
elementos armazenados no vetor que são superiores a 15.
 */

public class exer14_15_16 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 25, 15 };
        double somaElementos = 0, contaElementos = 0, elementos = vetorA.length;
        double media = 0, percentualImpar = 0;
        int elementosMaior15=0,elementosMenor15=0,elementosIgual15=0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 1) {
                somaElementos = somaElementos + vetorA[i];
                contaElementos++;
            }
            if(vetorA[i] >15){
                elementosMaior15++;
            }
            if(vetorA[i] ==15){
                elementosIgual15++;
            }else{
                elementosMenor15++;
            }
        }
        media = somaElementos / contaElementos;
        percentualImpar = contaElementos / elementos;
        System.out.println("Media dos elementos impares do array: " + media);
        System.out.println("Percentual de elementos ímpares e pares, respectivamente: " + percentualImpar * 100 + "% "
                + " e "+(1-percentualImpar) * 100 + "% ");
        System.out.println("Quantidade de elementos maior que 15: "+ elementosMaior15);
        System.out.println("Quantidade de elementos igual a 15: "+ elementosIgual15);
        System.out.println("Quantidade de elementos menor que 15: "+ elementosMenor15);


    }
}

// 4556 523