public class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;
    private static final double TAXA_SAQUE = 5.0;

    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }

        double valorTotal = valor;
        if (saquesGratuitosRestantes <= 0) {
            valorTotal += TAXA_SAQUE;
            System.out.println("Taxa de saque de R$ " + TAXA_SAQUE + " aplicada.");
        }

        if (valorTotal <= (saldo + limiteChequeEspecial)) {
            saldo -= valorTotal;
            if (saquesGratuitosRestantes > 0) {
                saquesGratuitosRestantes--;
                System.out.println("Saque gratuito realizado. Saques gratuitos restantes: " + saquesGratuitosRestantes);
            }
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
} 