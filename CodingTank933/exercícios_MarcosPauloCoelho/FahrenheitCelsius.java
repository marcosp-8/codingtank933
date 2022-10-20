package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

import java.util.Scanner;

public class FahrenheitCelsius {

    static double convert(double t) {
        return (t * 1.8) + 32;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o valor da temperatura 1 em Celsius: ");
        double celsius1 = leia.nextDouble();
        System.out.println("Insira o valor da temperatura 2 em Celsius: ");
        double celsius2 = leia.nextDouble();
        leia.close();

        double fahrenheit1 = convert(celsius1);
        double fahrenheit2 = convert(celsius2);

        System.out.printf("\nA temperatura %.1f°C equivale a %.1f°F.", celsius1, fahrenheit1);
        System.out.printf("\nA temperatura %.1f°C equivale a %.1f°F.", celsius2, fahrenheit2);

    }

}
