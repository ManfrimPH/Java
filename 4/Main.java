import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha o tipo de notificação:");
            System.out.println("1: Email");
            System.out.println("2: SMS");
            System.out.println("3: Push");

            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            TipoNotificacao tipo = switch (escolha) {
                case 1 -> TipoNotificacao.EMAIL;
                case 2 -> TipoNotificacao.SMS;
                case 3 -> TipoNotificacao.PUSH;
                default -> throw new ExcecaoNotificacaoInvalida("Opção inválida: " + escolha);
            };
            
            Notificacao notificacao = FabricaNotificacao.criarNotificacao(tipo);
            System.out.println("Digite a mensagem:");
            String mensagem = scanner.nextLine();
            notificacao.enviar(mensagem);
            
        } catch (ExcecaoNotificacaoInvalida e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
} 