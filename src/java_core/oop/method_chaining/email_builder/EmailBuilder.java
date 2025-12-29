    package java_core.poo.method_chaining.email_builder;

    public class EmailBuilder {
        private String destinatario;
        private String assunto;
        private String mensagem;

        EmailBuilder(){ System.out.println("Chamando construtor");}

        public EmailBuilder comDestinatario(String destinatario){
            this.destinatario = destinatario;
            return this;
        }

        public EmailBuilder comAssunto(String assunto) {
            this.assunto = assunto;
            return this;
        }

        public EmailBuilder comMensagem(String mensagem){
            this.mensagem = mensagem;
            return this;
        }

        void enviar(){
            System.out.println("Enviar email para: " + destinatario + assunto + mensagem );
        }
    }
