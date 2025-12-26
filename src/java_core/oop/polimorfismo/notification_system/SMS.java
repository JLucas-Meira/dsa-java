package java_core.oop.polimorfismo.notification_system;

public class SMS extends Notification {
    private String phoneNumber;
    private String subject;

    // --- Constructor ---
    public SMS(String phoneNumber, String subject){
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    // --- Getters and Setters
    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getSubject() {return subject;}

    public void setSubject(String subject) {this.subject = subject;}

    // --- Methods ---
    @Override
    public void send(){
        System.out.println("Enviando SMS para o número " + this.phoneNumber);
    }
}
