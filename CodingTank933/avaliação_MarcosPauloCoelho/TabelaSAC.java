package letsJava.CodingTank933.avaliação_MarcosPauloCoelho;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class TabelaSAC {
    public static void main(String[] args) {

        MathContext mc = new MathContext(2);

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo: ");
        BigDecimal emprestimo = leia.nextBigDecimal();
        System.out.println("Informe os juros ao mês: ");
        BigDecimal jurosUnit = leia.nextBigDecimal();
        System.out.println("Informe o tempo para quitação: ");
        int meses = leia.nextInt();
        leia.close();

        BigDecimal amort = emprestimo.divide(BigDecimal.valueOf(meses), mc);

        System.out.printf("Valor fixo da amortização R$%.2f, Saldo devedor total R$%.2f com juros de %.1f por cento ao mês.\n", amort, emprestimo, jurosUnit);

        BigDecimal saldoDevedorAtual = emprestimo;
        BigDecimal jurosPerCent = jurosUnit.divide(BigDecimal.valueOf(100), mc);
        BigDecimal totalPrestacoes = BigDecimal.ZERO;
        BigDecimal totalJuros = BigDecimal.ZERO;
        for (int i = 0; i < meses; i++) {
            BigDecimal juros = saldoDevedorAtual.multiply(jurosPerCent);
            BigDecimal parcela = juros.add(amort);
            saldoDevedorAtual = saldoDevedorAtual.subtract(amort);

            totalPrestacoes = totalPrestacoes.add(parcela);
            totalJuros = totalJuros.add(juros);

            System.out.printf("\nParcela %d | Juros: R$%.2f | Prestação: R$%.2f | Saldo devedor: R$%.2f", i + 1, juros, parcela, saldoDevedorAtual);
        }

        System.out.printf("\nTotal: Prestações = R$%.2f | Juros = R$%.2f | Amortização = R$%.2f. ", totalPrestacoes, totalJuros, emprestimo);
    }
}
