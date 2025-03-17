public class PagamentoBoleto implements EstrategiaPagamento {
    public void pagar(DadosPagamento dados) {
        System.out.println("=== Pagamento Boleto ===");
        System.out.println("Data: " + dados.getData());
        System.out.println("Valor: R$" + dados.getValor());
        System.out.println("Status: Boleto Gerado");
    }
} 