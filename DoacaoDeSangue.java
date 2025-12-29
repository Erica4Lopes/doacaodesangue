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
}
