package vetores;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = {2,5,1,3,4,9,7,8,10,6};
        int i,num;

        System.out.println("Digite um número para encontrar o correspondente ao vetor: ");
        num = leia.nextInt();
        for (i=0; i< vetor.length; i++) {
                if (num == vetor[i]) {
                    System.out.println("O número " + num + " está localizado na posição: " + i);
                }
            } if (num <0 || num > vetor.length) {
            System.out.println(" O número "+ num + " não foi encontrado!");
        }
}
}
