public class PagamentoCartao implements EstrategiaPagamento {
    public void pagar(DadosPagamento dados) {
        System.out.println("=== Pagamento Cartão ===");
        System.out.println("Data: " + dados.getData());
        System.out.println("Valor: R$" + dados.getValor());
        System.out.println("Status: Aprovado");
    }
} 