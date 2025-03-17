public class FabricaPagamento {
    public EstrategiaPagamento criarPagamento(int tipo) {
        return switch (tipo) {
            case 1 -> new PagamentoPix();
            case 2 -> new PagamentoCartao();
            case 3 -> new PagamentoBoleto();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido");
        };
    }
} 