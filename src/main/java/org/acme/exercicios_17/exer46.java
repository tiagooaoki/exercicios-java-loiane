package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 46.Em uma competição de salto em distância cada atleta tem direito a 
cinco saltos. No final da série de saltos de cada atleta, o melhor e o 
pior resultados são eliminados. O seu resultado fica sendo a média 
dos três valores restantes. Você deve fazer um programa que receba o 
nome e as cinco distâncias alcançadas pelo atleta em seus saltos e 
depois informe a média dos saltos conforme a descrição acima 
informada (retirar o melhor e o pior salto e depois calcular a média). 
Faça uso de uma lista para armazenar os saltos. Os saltos são 
informados na ordem da execução, portanto não são ordenados. O 
programa deve ser encerrado quando não for informado o nome do 
atleta. A saída do programa deve ser conforme o exemplo abaixo:
 */
public class exer46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //String[] listaNome = new String[100];
        
        
        String nome = " ";


        while ((!nome.equals("0"))) {
            double max=0, min=0, media=0, somaSaltos=0;
            int cont = 0;
            double[] listaSalto = new double[5];
            System.out.println("Digite o nome do atleta.");
            nome = scan.next();
            if (nome.equals("0")) {
                continue;
            }
            // listaNome[cont] = nome;
            // cont++;
            System.out.println("Insira o primeiro salto.");
            listaSalto[0] = scan.nextDouble();
            System.out.println("Insira o segundo salto.");
            listaSalto[1] = scan.nextDouble();
            System.out.println("Insira o terceiro salto.");
            listaSalto[2] = scan.nextDouble();
            System.out.println("Insira o quarto salto.");
            listaSalto[3] = scan.nextDouble();
            System.out.println("Insira o quinto salto.");
            listaSalto[4] = scan.nextDouble();
        

            max = listaSalto[0];
            min = max;

            for(double i : listaSalto){
                if(i > max) max = i;
                if(i < min) min = i;
                somaSaltos = somaSaltos + i;
            }
            media = (somaSaltos-min-max)/3;

            System.out.println(nome);
            for(double i : listaSalto){
                
                System.out.println("salto: " + i + " m.") ;
            }

            System.out.println("Melhor salto: " + max + " m.") ;
            System.out.println("Pior salto: " + min + " m.") ;
            System.out.println("Media de saltos: " + media + " m.") ;

            
        }

    }
}
