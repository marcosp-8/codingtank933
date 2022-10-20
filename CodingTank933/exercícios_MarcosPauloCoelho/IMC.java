package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe sua altura, em metros: ");
        double altura = leia.nextDouble();
        System.out.println("Informe seu peso, em quilogramas: ");
        double peso = leia.nextDouble();
        leia.close();

        double imc = peso / Math.pow(altura, 2);

        String tipo;
        if (imc > 0 && imc < 17){
            tipo = "muito abaixo do peso";
        } else if (imc >= 17.0 && imc <= 18.49 ) {
            tipo = "abaixo do peso";
        } else if (imc >= 18.50 && imc <= 24.99) {
            tipo = "peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            tipo = "acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            tipo = "obesidade";
        } else if (imc >= 35 && imc <= 39.99) {
            tipo = "obesidade severa";
        } else if (imc >= 40) {
            tipo = "obesidade mórbida";
        } else {
            System.out.println("Valores inválidos!");
            return;
        }

        System.out.printf("\nO valor do seu IMC é %.2f, considerado %s.", imc, tipo);
    }
}
