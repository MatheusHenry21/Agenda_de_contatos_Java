package model;
public class Contato {
    String nome;
    String celular;
    String endereco;

    public Contato(String nome, String celular, String endereco) {
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }

    public String getEndereco() {
        return endereco;
    }
}