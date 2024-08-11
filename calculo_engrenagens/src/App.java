import menus.*;
import utilitario.InputUtils;

import java.util.Scanner;

import static utilitario.InputUtils.esperarContinuarOuSair;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exibirMenuPrincipal(scanner);
        scanner.close();

    }

    public static void exibirMenuPrincipal(Scanner scanner){
        boolean continuar = true;

        while(continuar){
            InputUtils.exibirResultado(
                    """
                            ===== Cálculos de Engrenagens =====
                            Menu Principal:
                            1. Engrenagem Reta
                            2. Engrenagem Helicoidal
                            3. Ângulo Coroa
                            4. Entrecentro
                            5. Número Primo
                            Digite o número correspondente à sua escolha ou 's' para sair:"""
            );

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    MenuEngrenagemReta.exibirMenu(scanner);
                    break;
                case "2":
                    MenuEngrenagemHelicoidal.exibirMenu(scanner);
                    break;
                case "3":
                    MenuAnguloCoroa.exibirMenu(scanner);
                    break;
                case "4":
                    MenuEntrecentro.exibirMenu(scanner);
                    break;
                case "5":
                    MenuNumeroPrimo.exibirMenu(scanner);
                    break;
                case "s":
                case "S":
                    continuar = false;
                    InputUtils.exibirResultado("Encerrando o programa...");
                    break;
                default:
                    InputUtils.exibirResultado("Escolha inválida. Por favor, selecione uma opção válida.");
                    continue;
            }

            if (continuar) {
                boolean resultado = InputUtils.esperarContinuarOuSair(scanner);
                if (!resultado){
                    continuar = false;
                }
            }


            }



        }
    }


