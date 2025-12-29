// Trabalho APS
// Tema: Doação de Sangue

import java.util.Scanner;

public class DoacaoDeSangue {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        mostrarBoasVindas();

        while (opcao != 0) {            
            mostrarMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verificarElegibilidade(scanner);
                    break;
                case 2:
                    agendarDoacao(scanner);
                    break;
                case 3:
                    mostrarProcedimentos();
                    break;
                case 4:
                    mostrarDicas();
                    break;
                case 5:
                    quiz(scanner);
                    break;
                case 0:
                    mostrarEncerramento();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

    }

    public static void mostrarBoasVindas() {
        System.out.println("=================================");
        System.out.println("   BEM-VINDO AO PROGRAMA DE");
        System.out.println("        DOAÇÃO DE SANGUE");
        System.out.println("=================================");
    }

    public static void mostrarMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1 - Verificar elegibilidade");
        System.out.println("2 - Agendamento de doação");
        System.out.println("3 - Procedimentos de doação");
        System.out.println("4 - Dicas para doadores");
        System.out.println("5 - Quiz");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void verificarElegibilidade(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso(kg): ");
        double peso = scanner.nextDouble();

        if (idade >= 18 && peso >= 50) {
            System.out.println("Você está APTO para doar sangue.");
        } else {
            System.out.println("Você NÃO está apto para doar sangue.");
            System.out.println("Requisitos : idade mínima 18 anos e peso mínimo 50kg.");
        }        
    }

    public static void agendarDoacao(Scanner scanner) {
        System.out.print("Digite a data desejada (ex: 10/09): ");
        String data = scanner.next();

        System.out.print("Digite o horário desejado (ex: 15h): ");
        String horario = scanner.next();

        System.out.println("Doação agendada para " + data + " às " + horario + ".");
    }

    public static void mostrarProcedimentos() {
        System.out.println("\nPROCEDIMENTOS DE DOAÇÃO:");
        System.out.println("- Apresentar documento com foto.");
        System.out.println("- Triagem e entrevista.");
        System.out.println("- Coleta de sangue.");
        System.out.println("- Lanche e descanso.");
    }

    public static void mostrarDicas() {
        System.out.println("\nDICAS PARA DOADORES:");
        System.out.println("- Hidrate-se bem.");
        System.out.println("- Alimente-se antes de doar.");
        System.out.println("- Evite esforço físico após a doação.");
    }

    public static void quiz(Scanner scanner) {
        System.out.println("\nQUIZ - Doação de Sangue");
        int acertos = 0;

        int resposta1;
        do {
            System.out.print("\n1) Qual a idade mínima para doar sangue?\n1 - 16 anos\n2 - 18 anos\nResposta (1 ou 2):");
            resposta1 = scanner.nextInt();
            if (resposta1 != 1 && resposta1 != 2) {
                System.out.println("Opção inválida");
            }
        } while (resposta1 != 1 && resposta1 != 2);

        if (resposta1 == 2) {
            System.out.println("Resposta correta!");
            acertos++;
        } else {
            System.out.println("Infelizmente você errou. A idade mínima é 18 anos.");
        }

        int resposta2;
        do {
            System.out.print("\n2) Qual o peso mínimo para doar sangue?\n1 - 45kg\n2 - 50kg\nResposta (1 ou 2): ");
            resposta2 = scanner.nextInt();
            if (resposta2 != 1 && resposta2 != 2) {
                System.out.println("Opção inválida!");
            }
        } while (resposta2 != 1 && resposta2 != 2);

        if (resposta2 == 2) {
            System.out.println("Você acertou!");
            acertos++;
        } else {
            System.out.println("Resposta incorreta. O peso mínimo é 50kg.");
        }

        System.out.println("\nVocê acertou " + acertos + " de 2 perguntas.");
    }

    public static void mostrarEncerramento() {
        System.out.println("\nObrigado por utilizar o programa!");
        System.out.println("Doe sangue, salve vidas!");
    }
}
