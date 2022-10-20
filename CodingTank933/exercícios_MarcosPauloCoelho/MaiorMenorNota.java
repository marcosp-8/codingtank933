package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class MaiorMenorNota {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a quantidade de provas: ");
        int provas = leia.nextInt();

        if (provas > 0) {
            double [] notas = new double[provas];
            double maior = 0;
            double menor = 100;
            double soma = 0;

            for (int i = 1; i <= notas.length; i++) {
                System.out.printf("Informe a nota da prova %d, de 0 a 100: ", i);
                notas[i - 1] = leia.nextDouble();
                if (notas[i - 1] >= 0 && notas[i - 1] <= 100) {
                    soma += notas[i - 1];
                    if (notas[i - 1] > maior) { maior = notas[i - 1]; }
                    if (notas[i - 1] < menor) { menor = notas[i - 1]; }
                } else {
                    System.out.println("Nota inválida!");
                    return;
                }
            }

        double media = soma / notas.length;
        leia.close();

        System.out.printf("""
                \nA menor nota é %.1f.
                A maior nota é %.1f.
                A média das notas é %.1f.""", menor, maior, media);
        }
        else System.out.println("Quantidade inválida!");
    }
}
