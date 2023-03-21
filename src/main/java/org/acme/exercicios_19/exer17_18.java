package org.acme.exercicios_19;

/*
 * 17.Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35 
anos.
18.Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e 
escreva a menor e a maior idades e suas respectivas posições.
 */
public class exer17_18 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 36, 47 };
        int min=vetorA[0], max=min, cont=0, indMaior=0, indMenor=0;

        for(int i = 0 ; i< 10; i++){
            if(vetorA[i]>35) cont++;
            if(vetorA[i] < min ) {
                min = vetorA[i];
                indMenor = i+1;
            }
            if(vetorA[i] > max ) {
                max = vetorA[i];
                indMaior = i+1;
            }
        }

        System.out.println("Quantidade de elementos maior que 35: " + cont);
        System.out.println(("O maior elemento é: " + max+ " esta na posicao " + indMaior));
        System.out.println(("O menor elemento é: " + min+ " esta na posicao " + indMenor));

    }
}
