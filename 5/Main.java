import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorPagamento controlador = new ControladorPagamento();
        FabricaPagamento fabrica = new FabricaPagamento();

        while (true) {
            System.out.println("\nEscolha o método de pagamento:");
            System.out.println("1 - PIX");
            System.out.println("2 - Cartão de Crédito");
            System.out.println("3 - Boleto");
            System.out.println("0 - Sair");

            try {
                int opcao = scanner.nextInt();
                if (opcao == 0) break;

                System.out.println("Digite o valor do pagamento:");
                double valor = scanner.nextDouble();

                DadosPagamento dados = new DadosPagamento(valor);
                EstrategiaPagamento estrategia = fabrica.criarPagamento(opcao);
                controlador.realizarPagamento(estrategia, dados);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
} 