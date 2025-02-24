public class ContaInvestimento extends ContaBancaria {
    protected static final double TAXA_SAQUE = 0.02; // 2%

    public ContaInvestimento(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
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