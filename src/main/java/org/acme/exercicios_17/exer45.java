package org.acme.exercicios_17;

import java.util.Scanner;

/*
 * 45.Desenvolver um programa para verificar a nota do aluno em uma 
prova com 10 questões, o programa deve perguntar ao aluno a 
resposta de cada questão e ao final comparar com o gabarito da prova 
e assim calcular o total de acertos e a nota (atribuir 1 ponto por 
resposta certa). Após cada aluno utilizar o sistema deve ser feita uma 
pergunta se outro aluno vai utilizar o sistema. Após todos os alunos 
terem respondido informar:
. Maior e Menor Acerto;
a. Total de Alunos que utilizaram o sistema;
b. A Média das Notas da Turma.

Gabarito da Prova: 
01 - A 02 - B 03 - C 04 - D 05 - E 06 - E 07 - D 08 - C 09 - B 10 - A

Após concluir isto você poderia incrementar o programa 
permitindo que o professor digite o gabarito da prova antes dos 
alunos usarem o programa.
 */
public class exer45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Quantos alunos fizeram a prova");
        // int aluno = scan.nextInt();

        String[] gabarito = { "A", "B", "C", "D", "E", "E", "D", "C", "B", "A" };
        int cod = 1, repetir=1,preencherGabarito=1, qtdeAluno=0, max=0,min=0;
        double somaNotas=0,media=0;
        int[]notas = new int[100];

        
        while (preencherGabarito != 0) {
            System.out.println(" Gostaria de cadastrar novo gabarito? 1 - Sim, 0 - Não");
            preencherGabarito = scan.nextInt();
            if (preencherGabarito == 1) { 
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Insira o gabarito em ordem");
                    String resposta= scan.next();
                    gabarito[i] = resposta;
                }
                preencherGabarito=0;
                System.out.println(" Novo gabarito cadastrado com sucesso! \n \n");
            } 
            if (preencherGabarito == 0) {
                continue;
            }
            else{System.out.println("Digite 0 ou 1");}
        }

        while (cod != 0) {
            
            String[] prova = new String[10];
            String resposta;
            int cont = 0; 
            repetir=1;

            for (int i = 0; i < 10; i++) {
                System.out.println(" Insira as respostas em ordem");
                resposta = scan.next();
                prova[i] = resposta;
            }
            for (int i = 0; i < 10; i++) {
                if (prova[i].equalsIgnoreCase(gabarito[i])) {
                    cont++;
                }
            }
            System.out.println(" Nota: " + cont + "/10.");
            notas[qtdeAluno]=cont;
            qtdeAluno++;
            while (repetir != 0) {
                System.out.println(" Gostaria de registrar outra prova? 1 - Sim, 0 - Não");
                repetir = scan.nextInt();
                if (repetir == 1) { 
                    repetir=0;   
                    continue;
                } 
                if (repetir == 0) {
                    cod = 0;
                    System.out.println("Saindo...");
                    continue;
                }
                else{System.out.println("Digite 0 ou 1");}
            }
        }
        max = notas[0];
        min =max;
        for(int i = 0; i<qtdeAluno; i++ ){
           if(notas[i]>max) max = notas[i]; 
           if(notas[i]<min) min = notas[i];
           somaNotas = somaNotas+ notas[i];
        }
        media = somaNotas/qtdeAluno;

        System.out.println("Quantidade de alunos que registraram notas: "+ qtdeAluno);
        System.out.println("Maior nota: "+ max);
        System.out.println("Menor nota: "+ min);
        System.out.println("Media das notas: "+ media);

    }
}
