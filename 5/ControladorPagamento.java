public class ControladorPagamento {
    public void realizarPagamento(EstrategiaPagamento estrategia, DadosPagamento dados) {
        if (dados.getValor() <= 0) {
            throw new IllegalArgumentException("Valor inválido para pagamento");
        }
        estrategia.pagar(dados);
    }
} 