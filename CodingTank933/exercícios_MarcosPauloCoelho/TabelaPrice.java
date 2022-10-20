package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class TabelaPrice {
    public static void main(String[] args) {
        Scanner leia  = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo: ");
        double emprestimo = leia.nextDouble();
        System.out.println("Informe os juros ao mês: ");
        double jurosPerCent = leia.nextDouble() / 100;
        System.out.println("Informe o tempo para quitação: ");
        double meses = leia.nextDouble();
        leia.close();

        double prestacao = emprestimo * (Math.pow((1 + jurosPerCent), meses) * jurosPerCent) / (Math.pow((1 + jurosPerCent), meses) - 1);
        System.out.printf("Valor fixo da parcela: %.2f - Saldo devedor total: %.2f.", prestacao, emprestimo);

        double jurosFinal = 0;
        double amortizacao = emprestimo;
        for (int i = 0; i < meses; i++) {
            double juros = emprestimo * jurosPerCent;
            double amort = prestacao - juros;
            jurosFinal += juros;
            emprestimo -= amort;

            System.out.printf("\nParcela %d | Juros: R$%.2f | Amortização: R$%.2f | Saldo devedor: R$%.2f", (i + 1), juros, amort, emprestimo);
        }
        System.out.printf("\nTotal: \nPrestações =  R$%.2f \nJuros = R$%.2f \nAmortização = R$%.2f ",
                        (prestacao * meses), jurosFinal, amortizacao);
    }
}
