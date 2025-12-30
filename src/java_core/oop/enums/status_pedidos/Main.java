package java_core.oop.enums.status_pedidos;

public class Main {
    public static void main(String[] args) {

        for(StatusPedido s : StatusPedido.values()){

            System.out.println("Verificando status dos pedidos: " + s);
            if(s.podeCancelar()){
                System.out.println("O status " + s + " permite cancelamento.");
                System.out.println();
            } else {
                System.out.println("O status " + s + " NÃO permite cancelamento.");
            }
        }
    }
}
