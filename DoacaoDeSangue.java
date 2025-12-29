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
        System.out.println("Escolha uma opção: ");
    }

    public static void verificarElegibilidade(Scanner scanner) {
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso(kg): ");
        double peso = scanner.nextDouble();

        if (idade >= 18 && peso >= 50) {
            System.out.println("Você está APTO para doar sangue.");
        } else {
            System.out.println("Você NÃO está apto para doar sangue.");
            System.out.println("Requisitos : idade mínima 18 anos e peso mínimo 50kg.");
        }        
    }

    public static void agendarDoacao(Scanner scanner) {
        System.out.println("Digite a data desejada (ex: 10/09): ");
        String data = scanner.next();

        System.out.println("Digite o horário desejado (ex: 15h): ");
        String horario = scanner.next();

        System.out.println("Doação agendada para " + data + " às " + horario + ".");
    }

    public static void mostrarProcedimentos() {
        System.out.println("\nPROCEDIMENTOS DE DOÇÃO:");
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
        System.out.println("\nQUIZ:");
        System.out.println("Qual a idade mínima para doar sangue?");
        System.out.println("1 - 16 anos");
        System.out.println("2 - 18 anos");
        System.out.println("Resposta: ");

        int resposta = scanner.nextInt();

        if (resposta == 2) {
            System.out.println("Eba!! Resposa correta!");
        } else {
            System.out.println("Resposta incorreta. A idade mínima é 18 anos.");
        }
    }

    public static void mostrarEncerramento() {
        System.out.println("\nObrigado por utilizar o programa!");
        System.out.println("Doe sangue, salve vidas!");
    }
}
