package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class SomaFatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int n = leia.nextInt();
        leia.close();

        int soma = 0;
        if (n > 0) {
            int [] numeros = new int[n];
            for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = n;
                    soma += numeros[i];
                    n--;
            }

            System.out.printf("A soma dos antecessores positivos do número inserido é %d.", soma);

        } else System.out.println("O número inserido é inválido!");
    }
}

