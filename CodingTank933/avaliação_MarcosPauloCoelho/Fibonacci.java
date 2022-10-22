package letsJava.CodingTank933.avaliação_MarcosPauloCoelho;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual a quantidade de termos que deseja exibir na sequência de Fibonacci?");
        int[] sequencia = new int[leia.nextInt()];
        leia.close();

        sequencia[0] = 1;
        sequencia[1] = 1;
        for (int i = 2; i < sequencia.length; i++) {
            sequencia[i] = (sequencia[i - 1] + sequencia[i - 2]);
        }
        System.out.println(Arrays.toString(sequencia));
    }
}
