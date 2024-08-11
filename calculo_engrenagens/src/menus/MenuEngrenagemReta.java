package menus;

import java.util.Scanner;

import calculos.CalculoEngrenagemDenteReto;
import utilitario.InputUtils;

import static utilitario.InputUtils.*;

public class MenuEngrenagemReta {

    public static void exibirMenu(Scanner scanner) {
        int escolha = (int) obterEntrada(scanner, """
                Escolha o cálculo para engrenagem reta:
                1- Calcular Diâmetro
                2- Calcular Módulo
                3- Calcular Número de Dentes""");

        processarEscolha(escolha, scanner);
    }

    private static void processarEscolha(int escolha, Scanner scanner) {
        double modulo, diametro;
        int numeroDeDentes;

        switch (escolha) {

            case 1:
                modulo = obterEntrada(scanner, "Digite o módulo:");
                numeroDeDentes = (int) obterEntrada(scanner, "Digite o número de dentes:");
                double diametroCalculado = CalculoEngrenagemDenteReto.calcularDiametro(numeroDeDentes, modulo);
                exibirResultado("Diâmetro: " + diametroCalculado + "mm");
                break;

            case 2:
                diametro = obterEntrada(scanner, "Digite o diâmetro (em milímetros):");
                numeroDeDentes = (int) obterEntrada(scanner, "Digite o número de dentes:");
                double moduloCalculado = CalculoEngrenagemDenteReto.calcularModulo(diametro, numeroDeDentes);
                exibirResultado("Módulo: " + moduloCalculado);
                break;

            case 3:
                diametro = obterEntrada(scanner, "Digite o diâmetro:");
                modulo = obterEntrada(scanner, "Digite o módulo:");
                int numeroDeDentesCalculado = CalculoEngrenagemDenteReto.calcularNumeroDeDentes(diametro, modulo);
                exibirResultado("Número de dentes: " + numeroDeDentesCalculado);
                break;
            default:
                InputUtils.exibirMensagem("Entrada inválida");
                break;
        }
    }



}
