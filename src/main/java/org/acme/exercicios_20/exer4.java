package org.acme.exercicios_20;

import java.util.Scanner;

/*
 * 4. Faça um programa para armazenar em uma matriz os 
compromissos de uma agenda pessoal. Cada dia do mês deve 
conter 24 horas, onde para cada uma destas 24 horas podemos 
associar um tarefa específica (compromisso agendado). O 
programa deve ter um menu onde o usuário indica o dia do mês 
que deseja alterar e a hora, entrando em seguida com o 
compromisso, ou então, o usuário pode também consultar a 
agenda, fornecendo o dia e a hora para obter o 
compromisso armazenado.
 */
public class exer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matrixMes = new String[31][24];
        int cont = 100, hora = 0, dia = 0;
        String compromisso;
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                matrixMes[i][j]="";
            }
        }
        while (cont != 0) {
            System.out.println("Digite '1' para cadastrar compromisso na agenda e '2' para consultar. ('0' para sair)");
            cont = scan.nextInt();

            switch (cont) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o compromisso.");
                    compromisso = scan.next();
                    System.out.println("Digite o dia do mes.");
                    dia = scan.nextInt();
                    System.out.println("Digite a hora do dia (0-23).");
                    hora = scan.nextInt();
                    if (matrixMes[dia][hora].equals("")) {
                        matrixMes[dia][hora] = compromisso;
                    } else {
                        matrixMes[dia][hora] = matrixMes[dia][hora] + "; " + compromisso;
                    }

                    System.out.println("Compromisso guardado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o dia do mes.");
                    dia = scan.nextInt();
                    System.out.println("Digite a hora do dia (0-23).");
                    hora = scan.nextInt();
                    System.out.println("No dia " + dia + " às " + hora + " horas: ");
                    if (matrixMes[dia][hora].equals("")) {
                        System.out.println("Sem compromisso na agenda");
                    } else {
                        System.out.println(matrixMes[dia][hora]);
                    }

                    break;
            }

        }
    }
}
