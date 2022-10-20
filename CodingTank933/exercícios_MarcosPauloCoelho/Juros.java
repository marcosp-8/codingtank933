package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.math.BigDecimal;
import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor que será investido: ");
        BigDecimal valor = BigDecimal.valueOf(leia.nextDouble());
        System.out.println("Informe os juros ao mês em %: ");
        BigDecimal juros = BigDecimal.valueOf(leia.nextDouble());
        System.out.println("Informe por quantos meses o valor ficará investido: ");
        int meses = leia.nextInt();
        leia.close();

        for(int i = 1; i <= meses; i++){
            BigDecimal jurosNoValor = valor.multiply(juros.divide(BigDecimal.valueOf(100)));
            BigDecimal saldo = valor.add(jurosNoValor);
            valor = saldo;
            System.out.printf("\nMês %d: Juros: %.2f - Saldo: %.2f.", i, jurosNoValor, saldo);
        }
    }
}
