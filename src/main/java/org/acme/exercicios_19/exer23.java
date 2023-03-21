package org.acme.exercicios_19;

/*
 * 23.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.
 */
public class exer23 {
    public static void main(String[] args) {
        int[] vetor = {2,2,2,2,6,2,2,2,2,4};
        boolean temImpar = false;
        for(int i =0; i<10; i++){
            if(vetor[i]%2 ==1 ){
                temImpar=true;
                break;
            }
        }
        if(temImpar == true){
            System.out.println("Tem pelo menos um impar");
        } else{
            System.out.println("Todos os elementos são par");
        }
        
    }
    
}
