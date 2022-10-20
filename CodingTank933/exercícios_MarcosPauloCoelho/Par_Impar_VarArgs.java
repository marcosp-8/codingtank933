package letsJava.CodingTank933.exercícios_MarcosPauloCoelho;

public class Par_Impar_VarArgs {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Número inválido de argumentos! É esperado que seja informado um argumento.");
        } else {
            int a = Integer.parseInt(args[0]);
            String paridade = (a % 2 == 0) ? "par" : "ímpar";
            if (paridade.equals("par")){
                System.out.println("O argumento informado é par.");
            }
            else if (paridade.equals("ímpar")) {
                System.out.println("O argumento informado é ímpar.");
            }
        }
    }
}
