package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 47.Em uma competição de ginástica, cada atleta recebe votos de sete 
jurados. A melhor e a pior nota são eliminadas. A sua nota fica sendo 
a média dos votos restantes. Você deve fazer um programa que 
receba o nome do ginasta e as notas dos sete jurados alcançadas pelo 
atleta em sua apresentação e depois informe a sua média, conforme a 
descrição acima informada (retirar o melhor e o pior salto e depois 
calcular a média com as notas restantes). As notas não são 
informados ordenadas. Um exemplo de saída do programa deve ser 
conforme o exemplo abaixo:
 */
public class exer47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        String nome = " ";

        while ((!nome.equals("0"))) {
            int cont = 1;
            double max=0, min=0, media=0, somaSaltos=0;
            double[] listaSalto = new double[7];
            System.out.println("Digite o nome do atleta. (0 para encerrar)");
            nome = scan.next();
            if (nome.equals("0")) {
                continue;
            }
            // listaNome[cont] = nome;
            // cont++;
            System.out.println("Insira a primeiro nota.");
            listaSalto[0] = scan.nextDouble();
            System.out.println("Insira a segundo nota.");
            listaSalto[1] = scan.nextDouble();
            System.out.println("Insira a terceiro nota.");
            listaSalto[2] = scan.nextDouble();
            System.out.println("Insira a quarto nota.");
            listaSalto[3] = scan.nextDouble();
            System.out.println("Insira a quinto nota.");
            listaSalto[4] = scan.nextDouble();
            System.out.println("Insira a sexta nota.");
            listaSalto[5] = scan.nextDouble();
            System.out.println("Insira a setima nota.");
            listaSalto[6] = scan.nextDouble();
        

            max = listaSalto[0];
            min = max;

            for(double i : listaSalto){
                if(i > max) max = i;
                if(i < min) min = i;
                somaSaltos = somaSaltos + i;
            }
            media = (somaSaltos-min-max)/5;

            System.out.println(nome);
            for(double i : listaSalto){
                
                System.out.println("Nota "+ cont +": "+ i + ".") ;
                cont++;
            }

            System.out.println("Melhor nota: " + max + ".") ;
            System.out.println("Pior nota: " + min + ".") ;
            System.out.println("Media de notas: " + media + ".") ;

            
        }

    }
}
