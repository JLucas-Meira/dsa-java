package java_core.polimorfismo.notification_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> list = new ArrayList<>();
        list.add(new Email("joao@gmail.com", "Welcome to JAVA!!!"));
        list.add(new Email("jose@hotmail.com", "You are learning Stream in Java."));
        list.add(new SMS("+55 81 99830-3306", "Your verify code is 734210"));

        //Percorre a lista de notificações aplicando polimorfismo.
         for (Notification n : list) {
            n.logRegister();
            n.send();

            //Verifica o tipo específico de notificação (Recurso do Java 21)
            switch (n) {
                case Email e -> System.out.println("LOG: Email has subject " + e.getSubject());
                case SMS s -> System.out.println("LOG: SMS has subject " + s.getSubject());
                default -> System.out.println("Unknown type");
            }
            System.out.println("-------------------------------------------------");
        }

        System.out.println("--- STREAM API ---");
        System.out.println("Fltering only EMAILS for sending:");

        list.stream()
                .filter(n -> n instanceof Email) //Só passa se for Email
                .forEach(n -> { //Ação para quem passou
                    n.send();
                    System.out.println("Processed by Stream");
                });

        //Conta quantos sms tem na lista.
        long totalSMS = list.stream()
                .filter(n -> n instanceof SMS)
                .count();

        System.out.println("\nTotal SMS in the list:" + totalSMS);

    }
}