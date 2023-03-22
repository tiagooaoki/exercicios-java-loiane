package org.acme.exercicios_19;

/*
 * 24.Números palíndromos são aqueles que escritos da direita para a 
esquerda têm o mesmo valor quando escritos da esquerda para a 
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um 
programa que verifique se um dado vetor A de 10 elementos inteiros é 
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao 
último, se o segundo elemento do vetor é igual ao penúltimo e assim 
por diante até verificar todos os elementos ou chegar a conclusão que 
o vetor não é um palíndromo.
 */
public class exer24 {
    public static void main(String[] args) {
        int[] vetor = {2,3,4,5,6,6,5,4,3,2};
        
        int length = vetor.length, cont=1;
        boolean ehPalindromo=false;
        for (int i = 0; i < length/2; i++) {
            if(vetor[i]==vetor[(length-cont)]){
                cont++;
            }else{
                System.out.println("Nao eh um palindromo!");
                break;
            }
            
        }
        if(cont> length/2){
            ehPalindromo=true;
        }
        if(ehPalindromo){
            System.out.println("Eh um palindromo!");
        }
    }

}
