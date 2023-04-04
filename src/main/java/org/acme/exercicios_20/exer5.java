package org.acme.exercicios_20;

import java.util.Scanner;

/*
 * 5. Modifique o programa anterior de maneira a guardar os 
compromissos de todo o ano, organizados por mês, dia e hora 
(só 8 horas por dia).
 */
public class exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] matrixMes = new String[12][31][8];
        int cont = 100, hora = 0, dia = 0, mes=0;
        String compromisso;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 8; k++) {
                    matrixMes[i][j][k] = "";
                }
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
                    System.out.println("Digite o mes.");
                    mes = scan.nextInt();
                    System.out.println("Digite o dia do mes.");
                    dia = scan.nextInt();
                    System.out.println("Digite a hora do dia (8-15).");
                    hora = scan.nextInt()-8;
                    if (matrixMes[mes][dia][hora].equals("")) {
                        matrixMes[mes][dia][hora] = compromisso;
                    } else {
                        matrixMes[mes][dia][hora] = matrixMes[mes][dia][hora] + "; " + compromisso;
                    }

                    System.out.println("Compromisso guardado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o mes.");
                    mes = scan.nextInt();
                    System.out.println("Digite o dia do mes.");
                    dia = scan.nextInt();
                    System.out.println("Digite a hora do dia (8-15).");
                    hora = scan.nextInt()-8;
                    System.out.println("No dia " + dia + " do mes "+ mes + " às " + (hora+8) + " horas: ");
                    if (matrixMes[mes][dia][hora].equals("")) {
                        System.out.println("Sem compromisso na agenda");
                    } else {
                        System.out.println(matrixMes[mes][dia][hora]);
                    }

                    break;
            }

        }
    }
}
