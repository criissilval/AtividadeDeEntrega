import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Notificacao> notificacoes = List.of(
                new Email("exemple@exemple.com")
                new SMS("48 98888-8888")
        );

        String mensagem = "Alo! recebendo mensagem";
        for(Notificacao n : notificacoes){
            n.enviar(mensagem);
        }
    }
}