package java_core.arrays_listas.projetos.registro_funcionarios.entities;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    //Metodo para aumento do salário por porcentagem.
    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + nome + ", R$ " + String.format("%.2f", salario);
    }
}
