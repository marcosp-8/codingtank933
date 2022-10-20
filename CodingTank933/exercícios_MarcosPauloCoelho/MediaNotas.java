package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a nota da prova 1: ");
        double p1 = leia.nextDouble();
        System.out.println("Informe a nota da prova 2: ");
        double p2 = leia.nextDouble();
        System.out.println("Informe a nota da prova 3: ");
        double p3 = leia.nextDouble();
        System.out.println("Informe a nota da prova 4: ");
        double p4 = leia.nextDouble();
        leia.close();

        if (p1 >= 0 && p1 <= 10 &&
            p2 >= 0 && p2 <= 10 &&
            p3 >= 0 && p3 <= 10 &&
            p4 >= 0 && p4 <= 10) {
                double soma = p1 + p2 + p3 + p4;
                double media = soma / 4;
                System.out.printf("A média das notas de suas quatro provas é %.2f.", media);
    }   else {
            System.out.println("Nota inserida inválida.");
        }
    }
}
