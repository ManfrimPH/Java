import java.util.Scanner;

public class PagamentoCartaoCredito implements EstrategiaPagamento {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Digite o número do cartão: ");
        String numeroCartao = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito no valor de R$ " + valor);
        System.out.println("Pagamento aprovado com o cartão: " + numeroCartao);
    }
} 