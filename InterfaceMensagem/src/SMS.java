public class SMS implements notificacao{
    private final String numero;

    public SMS(String numero){
        this.numero = numero;
    }
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);

    }
}