package menus;

import calculos.CalculoNumeroPrimo;
import utilitario.InputUtils;

import java.util.Scanner;

public class MenuNumeroPrimo {

    public static void exibirMenu(Scanner scanner){
        int numero = (int) InputUtils.obterEntrada(scanner, "Digite um número para verificar se é primo:");
        boolean ehPrimo = CalculoNumeroPrimo.ehPrimo(numero);
        String mensagem = ehPrimo ? numero + " é um número primo." : numero + " não é um número primo.";
        InputUtils.exibirResultado(mensagem);


    }
}
