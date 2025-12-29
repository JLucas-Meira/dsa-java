package java_core.poo.method_chaining.email_builder;

public class EmailApp {
    public static void main(String[] args) {
        new EmailBuilder()
                .comDestinatario("teste@gmail.com")
                .comAssunto("Olá, tudo bem?")
                .comMensagem("Sou João Lucas e estou estudando method chaining")
                .enviar();
    }
}