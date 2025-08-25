public class Email implements notificacao{
    private final String destinatario;

    public Email(String destinatario){
        this.destinatario = destinatario;
    }
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando email para " + destinatario + " com a mensagem: " + mensagem);
    }
}