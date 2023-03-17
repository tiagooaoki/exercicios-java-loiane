package org.acme.exercicios_19;

/*
11.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a quantidade de elementos armazenados neste 
vetor que são pares.
12.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a soma de todos os elementos armazenados 
neste vetor.
13.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que determine a soma dos elementos armazenados neste vetor que 
são múltiplos de 5.
 */
public class exer11_12_13 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        int contPar=0, somaElementos=0, somaItemMultiplo5=0;

        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i]%2==0){
                contPar++;
            }
            somaElementos= somaElementos+ vetorA[i];
            if(vetorA[i]%5==0){
                somaItemMultiplo5 = somaItemMultiplo5 + vetorA[i];
            }

        }
      

        //print
        System.out.println("VetorA ");
        System.out.println("Quantidade de elementos pares: "+contPar);
        for (int i : vetorA) {
            if(i%2==0){
                System.out.println(i);
            }  
        }
        
        System.out.println("Soma de elementos: "+somaElementos);
        System.out.println("Soma de elementos que sao multiplos de 5: "+somaItemMultiplo5);


    }
}
