package org.acme.exercicios_19;

/*
 * 19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
 */
public class exer19 {
    public static void main(String[] args) {
        double[] nota1 = { 5, 7, 8, 5, 6, 9, 10, 8, 7, 9 };
        double[] nota2 = { 9, 6, 4, 2, 1, 9, 10, 8, 7, 9 };
        String[] resultado = new String[10];

        for (int i = 0; i < 10; i++) {
            if (((nota1[i] + nota2[i]) / 2) >= 7) {
                resultado[i] = "Aprovado";
            } else {
                resultado[i] = "Reprovado";
            }
        }

        for (String i : resultado) {
            System.out.println(i);

        }

    }
}
