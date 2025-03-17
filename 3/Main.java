import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessadorPagamento processador = new ProcessadorPagamento();

        while (true) {
            System.out.println("\nEscolha o método de pagamento:");
            System.out.println("1: PIX");
            System.out.println("2: Cartão de Crédito");
            System.out.println("3: Boleto");
            System.out.println("0: Sair");

            int opcao = scanner.nextInt();
            
            if (opcao == 0) {
                break;
            }

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Digite o valor do pagamento: ");
                double valor = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        processador.setEstrategiaPagamento(new PagamentoPix());
                        break;
                    case 2:
                        processador.setEstrategiaPagamento(new PagamentoCartaoCredito());
                        break;
                    case 3:
                        processador.setEstrategiaPagamento(new PagamentoBoleto());
                        break;
                }

                processador.realizarPagamento(valor);
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
} 