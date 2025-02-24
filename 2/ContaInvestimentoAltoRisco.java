public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_SAQUE = 0.05; // 5%
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }

        if (saldo < SALDO_MINIMO) {
            System.out.println("Saldo mínimo de R$ " + SALDO_MINIMO + " não atingido para realizar saques.");
            return false;
        }

        double valorComTaxa = valor * (1 + TAXA_SAQUE);
        
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            System.out.println("Taxa de saque: R$ " + String.format("%.2f", valor * TAXA_SAQUE));
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
} 