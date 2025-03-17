public class DadosPagamento {
    private final double valor;
    private final String data;

    public DadosPagamento(double valor) {
        this.valor = valor;
        this.data = java.time.LocalDateTime.now().toString();
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
} 