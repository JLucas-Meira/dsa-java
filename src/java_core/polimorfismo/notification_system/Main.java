package java_core.polimorfismo.notification_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> list = new ArrayList<>();
        list.add(new Email("joao@gmail.com", "Olá, temos vagas abertas"));
        list.add(new SMS("+55 81 99830-3306", "Você recebeu uma recarga"));

        for (Notification n : list) {
            n.send();

            switch (n) {
                case Email e -> System.out.println("LOG: Email has subject " + e.getDestination());
                case SMS s -> System.out.println("LOG: SMS has subject " + s.getPhoneNumber());
                default -> System.out.println("Unknown type");
            }
            System.out.println("-------------------------------------------------");
        }

    }
}