package vetores;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, somaDiagonalPrincipal, somaDiagonalSecundaria, linha, coluna;
        int[][] matriz = new int[3][3];

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println(
                        "Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }
                somaDiagonalPrincipal = (matriz[0][0]) + (matriz[1][1]) + (matriz[2][2]);
                somaDiagonalSecundaria = ((matriz[0][2]) + (matriz[1][1]) + (matriz[2][0]));
                System.out.println("Elementos da Diagonal Principal: "+ matriz[0][0] +","+ matriz[1][1] +","+ matriz[2][2]);
                System.out.println("Elementos da Diagonal Secundária: "+ matriz[0][2] +","+ matriz[1][1] +","+ matriz[2][0]);
                System.out.println("Elementos da Diagonal Principal: "+ somaDiagonalPrincipal);
                System.out.println("Elementos da Diagonal Principal: "+ somaDiagonalSecundaria);
            }
        }