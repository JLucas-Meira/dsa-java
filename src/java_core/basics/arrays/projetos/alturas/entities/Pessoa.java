package java_core.basics.arrays.projetos.alturas.entities;

public class Pessoa {

    //Atributos da classe
    private String nome;
    private int idade;
    private double altura;

    //Construtor para criar novos objetos 'Pessoa'.
    public Pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Métodos Getters
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
