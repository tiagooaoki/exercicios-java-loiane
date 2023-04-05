package org.acme.exercicios_20;

import java.util.Scanner;

/*
 * 6. Faça um programa para jogar o jogo da velha. O programa deve 
permitir que dois jogadores façam uma partida do jogo da velha, 
usando o computador para ver o tabuleiro. Cada jogador vai 
alternadamente informando a posição onde deseja colocar a sua 
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e 
determinar automaticamente quando o jogo terminou e quem foi o 
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa 
deve atualizar a situação do tabuleiro na tela.
 */
// 06/04 to do
//fazer: logica pra vencer jogo
//repetir a joga em caso de posicao invalida
//nao permitir preencher onde ja foi jogado

public class exer6 {
    public static int posicao(String jogada) {

        if (jogada.equals("1-1"))
            return 1;
        if (jogada.equals("1-2"))
            return 2;
        if (jogada.equals("1-3"))
            return 3;
        if (jogada.equals("2-1"))
            return 4;
        if (jogada.equals("2-2"))
            return 5;
        if (jogada.equals("2-3"))
            return 6;
        if (jogada.equals("3-1"))
            return 7;
        if (jogada.equals("3-2"))
            return 8;
        if (jogada.equals("3-3"))
            return 9;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fimJogo = false;
        String vazio = " ", line = "_", pipe = "|", player1 = "Player 1", player2 = "Player 2", x = "X", o = "O",
                jogada = "1-1", posicao1 = line, posicao2 = line, posicao3 = line, posicao4 = line, posicao5 = line,
                posicao6 = line, posicao7 = vazio, posicao8 = vazio, posicao9 = vazio;
        int contador = 0, linha = 0, coluna = 0;
        System.out.println("  " + 1 + vazio + 2 + vazio + 3);
        System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
        System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
        System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);
        while (contador < 9) {

            //vez do player2
            System.out.println(
                    player1 + ", selecione uma posicao para marcar com " + x + " no formato linha-coluna (ex 1-1)");
            jogada = scan.next();
            System.out.println(jogada);
            switch (posicao(jogada)) {
                case 1: {
                    posicao1 = x;
                    break;
                }
                case 2: {
                    posicao2 = x;
                    break;
                }
                case 3: {
                    posicao3 = x;
                    break;
                }
                case 4: {
                    posicao4 = x;
                    break;
                }
                case 5: {
                    posicao5 = x;
                    break;
                }
                case 6: {
                    posicao6 = x;
                    break;
                }
                case 7: {
                    posicao7 = x;
                    break;
                }
                case 8: {
                    posicao8 = x;
                    break;
                }
                case 9: {
                    posicao9 = x;
                    break;
                }
                default:
                    System.out.println("posicao invalida");
                    break;
            }
            contador++;
            System.out.println("  " + 1 + vazio + 2 + vazio + 3);
            System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
            System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
            System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);

            //vez do player2
            System.out.println(
                    player2 + ", selecione uma posicao para marcar com " + o + " no formato linha-coluna (ex 1-1)");
            jogada = scan.next();
            switch (posicao(jogada)) {
                case 1: {
                    posicao1 = o;
                    break;
                }
                case 2: {
                    posicao2 = o;
                    break;
                }
                case 3: {
                    posicao3 = o;
                    break;
                }
                case 4: {
                    posicao4 = o;
                    break;
                }
                case 5: {
                    posicao5 = o;
                    break;
                }
                case 6: {
                    posicao6 = o;
                    break;
                }
                case 7: {
                    posicao7 = o;
                    break;
                }
                case 8: {
                    posicao8 = o;
                    break;
                }
                case 9: {
                    posicao9 = o;
                    break;
                }
                default:
                    System.out.println("posicao invalida");
                    break;
            }
            contador++;
            System.out.println("  " + 1 + vazio + 2 + vazio + 3);
            System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
            System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
            System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);
        }

    }
}
