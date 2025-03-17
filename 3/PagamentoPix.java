import java.util.Random;

public class PagamentoPix implements EstrategiaPagamento {
    @Override
    public void processarPagamento(double valor) {
        String codigoPix = String.format("%040d", new Random().nextLong());
        System.out.println("Pagamento via PIX no valor de R$ " + valor);
        System.out.println("Código PIX: " + codigoPix);
    }
} 