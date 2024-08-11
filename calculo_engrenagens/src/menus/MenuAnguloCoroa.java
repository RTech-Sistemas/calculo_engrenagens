package menus;

import calculos.CalculoAnguloCoroa;
import utilitario.InputUtils;

import java.util.Scanner;

public class MenuAnguloCoroa {

    public static void exibirMenu(Scanner scanner){
        double semFim = InputUtils.obterEntrada(scanner, "Digite o diâmetro do sem fim em mm:");
        double modulo = InputUtils.obterEntrada(scanner, "Digite o módulo:");
        int numeroDeEntradas = (int) InputUtils.obterEntrada(scanner, "Digite o número de entradas do sem fim");

        double anguloEmGraus = CalculoAnguloCoroa.calcular(semFim, modulo, numeroDeEntradas);

        String anguloGMS = CalculoAnguloCoroa.converterParaGMS(anguloEmGraus);
        InputUtils.exibirResultado("Ângulo da coroa: " + anguloGMS);
    }
}
