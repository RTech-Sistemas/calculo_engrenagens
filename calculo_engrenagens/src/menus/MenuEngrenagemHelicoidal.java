package menus;

import calculos.CalculoEngrenagemDenteHelicoidal;
import utilitario.InputUtils;

import java.util.Scanner;

public class MenuEngrenagemHelicoidal {

    public static void exibirMenu(Scanner scanner){
        double modulo = InputUtils.obterEntrada(scanner, "Digite o módulo:");
        int numeroDeDentes = (int) InputUtils.obterEntrada(scanner, "Digite o número de dentes:" );
        double angulo = InputUtils.obterEntrada(scanner, "Digite o ângulo em graus:");
        double resultado = CalculoEngrenagemDenteHelicoidal.calculoEngrenagemHelicoidal(modulo, numeroDeDentes, angulo);
        InputUtils.exibirResultado(String.format("Diâmetro: %.2fmm", resultado));
    }
}
