package letsJava.CodingTank933;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConvertVelocidade {
    public static void main(String[] args) {
        Random random = new Random();

        double[] velocidades = new double[5];
        for (int i = 0; i < velocidades.length; i++) {
            velocidades[i] = random.nextDouble(100);
        }

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a unidade de origem: ");
        String origem = leia.next();
        System.out.println("Informe a unidade de destino: ");
        String destino = leia.next();
        leia.close();

        String valoresRandom = Arrays.toString(velocidades);
        String random2kmh = Arrays.toString(origin2kmh(velocidades, origem));
        String randomConvertido = Arrays.toString(kmh2destiny(origin2kmh(velocidades, origem), destino));

        System.out.println("Valores aleatórios na unidade de origem:\n " + valoresRandom );
        System.out.println("Valores aleatórios em km/h:\n " + random2kmh);
        System.out.println("Valores aleatórios na unidade de destino:\n " + randomConvertido);
    }
    public static double[] origin2kmh (double[] v, String origin) {
        switch (origin) {
            case "m/s" : for (int j = 0; j < v.length; j++) { v[j] *= 3.6; }
            case "mile/h": for (int j = 0; j < v.length; j++) { v[j] *= 1.609; }
            case "knot": for (int j = 0; j < v.length; j++) { v[j] *= 1.852; }
            case "km/h": for (int j = 0; j < v.length; j++) { v[j] *= 1; }
        } return v;
    }
    public static double[] kmh2destiny (double[] v, String destiny) {
        switch (destiny) {
            case "m/s" : for (int j = 0; j < v.length; j++) { v[j] /= 3.6; }
            case "mile/h": for (int j = 0; j < v.length; j++) { v[j] /= 1.609; }
            case "knot": for (int j = 0; j < v.length; j++) { v[j] /= 1.852; }
            case "km/h": for (int j = 0; j < v.length; j++) { v[j] /= 1; }
        } return v;
    }
}