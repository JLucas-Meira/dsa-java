package java_core.basics.arrays.projetos.pensionato.entities;

public class Rent {

    private String name;
    private String email;

    public Rent(){
    }

    public Rent(String nome, String email){
        this.name = nome;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
