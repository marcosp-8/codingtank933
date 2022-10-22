package letsJava.CodingTank933.avaliação_MarcosPauloCoelho;

import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o mês: ");
        String mes = leia.next();
        leia.close();

       if (mes.equalsIgnoreCase("janeiro") ||
           mes.equalsIgnoreCase("março") ||
           mes.equalsIgnoreCase("maio") ||
           mes.equalsIgnoreCase("julho") ||
           mes.equalsIgnoreCase("agosto") ||
           mes.equalsIgnoreCase("outubro") ||
           mes.equalsIgnoreCase("dezembro") ) {

           System.out.printf("\nO mês de %s possui 31 dias.", mes);
       }
       else if (mes.equalsIgnoreCase("abril") ||
                mes.equalsIgnoreCase("junho") ||
                mes.equalsIgnoreCase("setembro") ||
                mes.equalsIgnoreCase("novembro") ) {

           System.out.printf("\nO mês de %s possui 30 dias.", mes);
       }
       else if (mes.equalsIgnoreCase("fevereiro")) {

           System.out.println("Fevereiro possui 28 dias.");
       }
       else System.out.println("O mês informado é inválido!");
    }
}
