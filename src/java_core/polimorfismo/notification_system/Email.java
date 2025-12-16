package java_core.polimorfismo.notification_system;

public class Email extends Notification {
    private String destination;
    private String subject;

    public Email(String destination,String subject){
        this.destination = destination;
        this.subject = subject;
    }

    // --- Getters and Setters ---
    public String getDestination() {return destination;}
    public void setDestination(String destination) {this.destination = destination;}
    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}


    @Override
    public void send() {
        System.out.println("Enviando email para " + this.destination);
    }
}
