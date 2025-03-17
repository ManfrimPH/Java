public class ProcessadorPagamento {
    private EstrategiaPagamento estrategiaPagamento;

    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void realizarPagamento(double valor) {
        estrategiaPagamento.processarPagamento(valor);
    }
} 