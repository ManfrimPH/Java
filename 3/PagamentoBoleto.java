import java.util.Random;

public class PagamentoBoleto implements EstrategiaPagamento {
    @Override
    public void processarPagamento(double valor) {
        String codigoBoleto = String.format("%048d", new Random().nextLong());
        System.out.println("Pagamento via Boleto no valor de R$ " + valor);
        System.out.println("Código do Boleto: " + codigoBoleto);
    }
} 