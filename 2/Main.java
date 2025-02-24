public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Teste ContaCorrente ===");
        ContaCorrente cc = new ContaCorrente("CC001", "João Silva", 1000.0, 500.0);
        cc.exibirInformacoes();
        cc.sacar(1200.0);
        cc.exibirInformacoes();

        System.out.println("\n=== Teste ContaPoupanca ===");
        ContaPoupanca cp = new ContaPoupanca("CP001", "Maria Santos", 1000.0);
        cp.exibirInformacoes();
        cp.sacar(1200.0);
        cp.sacar(500.0);
        cp.exibirInformacoes();

        System.out.println("\n=== Teste ContaInvestimento ===");
        ContaInvestimento ci = new ContaInvestimento("CI001", "Pedro Oliveira", 1000.0);
        ci.exibirInformacoes();
        ci.sacar(500.0);
        ci.exibirInformacoes();

        System.out.println("\n=== Teste ContaSalario ===");
        ContaSalario cs = new ContaSalario("CS001", "Ana Lima", 1000.0, 100.0);
        cs.exibirInformacoes();
        cs.sacar(200.0);
        cs.sacar(200.0);
        cs.exibirInformacoes();

        System.out.println("\n=== Teste ContaInvestimentoAltoRisco ===");
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("CIAR001", "Carlos Souza", 15000.0);
        ciar.exibirInformacoes();
        ciar.sacar(1000.0);
        ciar.exibirInformacoes();
    }
} 