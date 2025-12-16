package java_core.polimorfismo.notification_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> list = new ArrayList<>();
        list.add(new Email("joao@gmail.com", "Welcome to JAVA!!!"));
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

    }
}