package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a operação que deseja realizar (opções: + - * /): ");
        String op = leia.next();

        if (op.equalsIgnoreCase("+") ||
            op.equalsIgnoreCase("-") ||
            op.equalsIgnoreCase("*") ||
            op.equalsIgnoreCase("/")) {

                System.out.println("Informe um número inteiro: ");
                int n1 = leia.nextInt();
                System.out.println("Informe outro número inteiro: ");
                int n2 = leia.nextInt();

                switch (op) {
                    case "+" -> {
                        int soma = n1 + n2;
                        System.out.printf("A soma entre os números %d e %d é %d.", n1, n2, soma);
                    }
                    case "-" -> {
                        int sub = n1 - n2;
                        System.out.printf("A subtração entre os números %d e %d é %d.", n1, n2, sub);
                    }
                    case "*" -> {
                        int mult = n1 * n2;
                        System.out.printf("A multiplicação entre os números %d e %d é %d.", n1, n2, mult);
                    }
                    case "/" -> {
                        int div = n1 / n2;
                        System.out.printf("A divisão entre os números %d e %d é %d.", n1, n2, div);
                    }
                }
        } else System.out.println("Operação desconhecida.");

        leia.close();
    }
}
