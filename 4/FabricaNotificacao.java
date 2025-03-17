public class FabricaNotificacao {
    public static Notificacao criarNotificacao(TipoNotificacao tipo) throws ExcecaoNotificacaoInvalida {
        if (tipo == null) {
            throw new ExcecaoNotificacaoInvalida("Tipo de notificação não pode ser nulo");
        }
        
        return switch (tipo) {
            case EMAIL -> new NotificacaoEmail();
            case SMS -> new NotificacaoSms();
            case PUSH -> new NotificacaoPush();
        };
    }
} 