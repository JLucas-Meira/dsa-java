package java_core.oop.enums.status_pedidos;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1, "Aguardando pagamento"),
    PAGO(2, "Pedido pago"),
    CANCELADO(3, "Pedido cancelado");

    private final int codigo;
    private final String descricao;

    StatusPedido(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean podeCancelar() {
        return this != CANCELADO;
    }

}
