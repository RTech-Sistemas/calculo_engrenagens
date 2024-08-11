package menus;

import calculos.CalculoEntrecentro;
import utilitario.InputUtils;

import java.util.Scanner;

public class MenuEntrecentro {

    public static void exibirMenu(Scanner scanner){
        double modulo = InputUtils.obterEntrada(scanner, "Digite o módulo:");
        int numeroDeDentes1 = (int) InputUtils.obterEntrada(scanner, "Digite o número de dentes da engrenagem 1:");
        int numeroDeDentes2 = (int) InputUtils.obterEntrada(scanner, "Digite o número de dentes da engrenagem 2:");
        double entrecentro = CalculoEntrecentro.calcularEntrecentro(modulo, numeroDeDentes1, numeroDeDentes2);
        InputUtils.exibirResultado("Valor do entrecentro: " + entrecentro + "mm");
    }
}
