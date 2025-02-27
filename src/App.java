import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RelatorioDeVendas rv = new RelatorioDeVendas();
        RelatorioDeVendas.verificarOuCriarArquivo();

        while (true) {
            System.out.println("\n1 - Deletar Relatório");
            System.out.println("2 - Adicionar Relatório");
            System.out.println("3 - Ler Relatórios");
            System.out.println("4 - Modificar Relatório");
            System.out.println("5 - Adicionar Feedback.");
            System.out.println("6 - Visualizar Feedback.");
            System.out.println("7 - Sair do programa.");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    rv.deletarRelatorio(sc);
                    break;
                case 2:
                    rv.adicionarRelatorio(sc);
                    break;
                case 3:
                    rv.lerRelatorios();
                    break;
                case 4:
                    rv.modificarRelatorio(sc);
                    break;
                case 5:
                    FeedbackCliente.escolherAcao(sc);
                    FeedbackCliente.informacaoInicial(sc);
                    FeedbackCliente.escritorDeTexto();
                    FeedbackCliente.escreverFeedback("Feedback.txt", null, null);
                    
                    break;  
                case 6:
                    FeedbackCliente.lerFeedback();
                    break;

                case 7:
                    sc.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Opção inválida.");
            }
            
        }
      
    }
}
