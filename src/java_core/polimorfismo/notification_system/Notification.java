package java_core.polimorfismo.notification_system;

public abstract class Notification {
    public void logRegister(){
        System.out.println("Log: Iniciando envio...");
    }

    public abstract void send();
}
