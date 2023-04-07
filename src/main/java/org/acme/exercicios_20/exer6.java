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

    static boolean fimJogo = false, posicaoInvalida = false;
    static String vazio = " ", line = "_", pipe = "|", player1 = "Player 1", player2 = "Player 2", x = "X", o = "O",
            jogada = "1-1", posicao1 = line, posicao2 = line, posicao3 = line, posicao4 = line, posicao5 = line,
            posicao6 = line, posicao7 = vazio, posicao8 = vazio, posicao9 = vazio;
    static int contador = 0, linha = 0, coluna = 0;

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

    public static void verificaVencedor() {
        String vencedor;
        if (posicao1 == x && posicao4 == x && posicao7 == x || posicao1 == o && posicao4 == o && posicao7 == o) {
            fimJogo = true;
            vencedor = posicao1 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao2 == x && posicao5 == x && posicao8 == x || posicao2 == o && posicao5 == o && posicao8 == o) {
            fimJogo = true;
            vencedor = posicao2 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao3 == x && posicao6 == x && posicao9 == x || posicao3 == o && posicao6 == o && posicao9 == o) {
            fimJogo = true;
            vencedor = posicao3 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao1 == x && posicao2 == x && posicao3 == x || posicao1 == o && posicao2 == o && posicao3 == o) {
            fimJogo = true;
            vencedor = posicao1 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao4 == x && posicao5 == x && posicao6 == x || posicao4 == o && posicao5 == o && posicao6 == o) {
            fimJogo = true;
            vencedor = posicao4 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao7 == x && posicao8 == x && posicao9 == x || posicao7 == o && posicao8 == o && posicao9 == o) {
            fimJogo = true;
            vencedor = posicao7 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao1 == x && posicao5 == x && posicao9 == x || posicao1 == o && posicao5 == o && posicao9 == o) {
            fimJogo = true;
            vencedor = posicao1 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

        if (posicao3 == x && posicao5 == x && posicao7 == x || posicao3 == o && posicao5 == o && posicao7 == o) {
            fimJogo = true;
            vencedor = posicao3 == x ? "1" : "2";
            System.out.println("Fim de Jogo! O vencedor foi o player " + vencedor);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("  " + 1 + vazio + 2 + vazio + 3);
        System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
        System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
        System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);
        while (contador < 9 && !fimJogo) {
            posicaoInvalida = false;
            while (!posicaoInvalida) {
                // vez do player1
                System.out.println(
                        player1 + ", selecione uma posicao para marcar com " + x + " no formato linha-coluna (ex 1-1)");
                jogada = scan.next();
                switch (posicao(jogada)) {
                    case 1: {
                        if (posicao1.equals(vazio) || posicao1.equals(line)) {
                            posicao1 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }

                    }
                    case 2: {
                        if (posicao2.equals(vazio) || posicao2.equals(line)) {
                            posicao2 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 3: {
                        if (posicao3.equals(vazio) || posicao3.equals(line)) {
                            posicao3 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 4: {
                        if (posicao4.equals(vazio) || posicao4.equals(line)) {
                            posicao4 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 5: {
                        if (posicao5.equals(vazio) || posicao5.equals(line)) {
                            posicao5 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 6: {
                        if (posicao6.equals(vazio) || posicao6.equals(line)) {
                            posicao6 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 7: {
                        if (posicao7.equals(vazio) || posicao7.equals(line)) {
                            posicao7 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 8: {
                        if (posicao8.equals(vazio) || posicao8.equals(line)) {
                            posicao8 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 9: {
                        if (posicao9.equals(vazio) || posicao9.equals(line)) {
                            posicao9 = x;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    default:
                        System.out.println("posicao invalida");
                        break;
                }}
                contador++;

                System.out.println("  " + 1 + vazio + 2 + vazio + 3);
                System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
                System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
                System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);
                verificaVencedor();
                if (fimJogo)
                    continue;
            
            posicaoInvalida=false;
            while (!posicaoInvalida && !fimJogo) {
                // vez do player2
                System.out.println(
                        player2 + ", selecione uma posicao para marcar com " + o + " no formato linha-coluna (ex 1-1)");
                jogada = scan.next();
                switch (posicao(jogada)) {
                    case 1: {
                        if (posicao1.equals(vazio) || posicao1.equals(line)) {
                            posicao1 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }

                    }
                    case 2: {
                        if (posicao2.equals(vazio) || posicao2.equals(line)) {
                            posicao2 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 3: {
                        if (posicao3.equals(vazio) || posicao3.equals(line)) {
                            posicao3 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 4: {
                        if (posicao4.equals(vazio) || posicao4.equals(line)) {
                            posicao4 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 5: {
                        if (posicao5.equals(vazio) || posicao5.equals(line)) {
                            posicao5 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 6: {
                        if (posicao6.equals(vazio) || posicao6.equals(line)) {
                            posicao6 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 7: {
                        if (posicao7.equals(vazio) || posicao7.equals(line)) {
                            posicao7 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 8: {
                        if (posicao8.equals(vazio) || posicao8.equals(line)) {
                            posicao8 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    case 9: {
                        if (posicao9.equals(vazio) || posicao9.equals(line)) {
                            posicao9 = o;
                            posicaoInvalida=true;
                            break;
                        } else {
                            System.out.println("Posição ja foi preenchida");
                            break;
                        }
                    }
                    default:
                        System.out.println("posicao invalida");
                        break;
                }
            }
                contador++;

                System.out.println("  " + 1 + vazio + 2 + vazio + 3);
                System.out.println(1 + " " + posicao1 + pipe + posicao2 + pipe + posicao3);
                System.out.println(2 + " " + posicao4 + pipe + posicao5 + pipe + posicao6);
                System.out.println(3 + " " + posicao7 + pipe + posicao8 + pipe + posicao9);
                verificaVencedor();

            
        }
    }
}
