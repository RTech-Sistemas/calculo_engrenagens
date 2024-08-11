package utilitario;

import java.util.Scanner;

public class InputUtils {

    public static double obterEntrada(Scanner scanner, String mensagem) {
        while (true){
            System.out.println(mensagem);
            if (scanner.hasNextDouble()){
                return scanner.nextDouble();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        }
    }

    public static void exibirResultado(String resultado) {
        System.out.println(resultado);
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static boolean esperarContinuarOuSair(Scanner scanner) {
        //System.out.println("Digite 'c' para continuar ou 's' para sair:");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("s")) {
                System.out.println("Encerrando o programa...");
                return false;  // Indica que o programa deve encerrar
            } else if (input.equalsIgnoreCase("c")) {
                return true;  // Indica que o programa deve continuar
            } else {
                System.out.println("Digite 'c' para continuar ou 's' para sair.");
            }
        }
    }

}
