package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class SomaArgs {
    
    static double soma(double a, double b) {return a + b;}
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        if (args.length == 0){
            System.out.println("Informe um número: ");
            double n1 = leia.nextDouble();
            System.out.println("Informe outro número: ");
            double n2 = leia.nextDouble();
            System.out.printf("\nA soma dos números informados é %.1f.", soma(n1, n2));
        } else if (args.length == 1) {
            System.out.println("Informe um número: ");
            double n1 = leia.nextDouble();
            System.out.printf("\nA soma do número informado com as definições do sistema é %.1f.",
                    soma(Double.parseDouble(args[0]), n1));
        } else if (args.length == 2) {
            System.out.printf("\nA soma das definições de sistema é %.1f.",
                    soma(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
        } else System.out.println("Número de argumentos inválido.");

        leia.close();
    }
}
