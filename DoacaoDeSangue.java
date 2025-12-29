import java.util.Scanner;

public class DoacaoDeSangue {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        System.out.println("=================================");
        System.out.println("   BEM-VINDO AO PROGRAMA DE");
        System.out.println("        DOAÇÃO DE SANGUE");
        System.out.println("=================================");

        while (opcao != 0) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1 - Verificar elegibilidade");
            System.out.println("2 - Agendamento de doação");
            System.out.println("3 - Procedimentos de doação");
            System.out.println("4 - Dicas para doadores");
            System.out.println("5 - Quiz");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Verificação de elegibilidade (em construção)");
                    break;
                case 2:
                    System.out.println("Agendamento de doação (em construção)");
                    break;
                case 3:
                    System.out.println("Procedimentos de doação (em construção)");
                    break;
                case 4:
                    System.out.println("Dicas para doadores (em construção)");
                    break;
                case 5:
                    System.out.println("Quiz (em construção)");
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

    }
}
