package service;
import java.util.ArrayList;

import model.Contato;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
        System.out.println("O contato de " + contato.getNome() + " adicionado com sucesso!");
    }

    public void listar(){
        if (contatos.isEmpty()){
            System.out.println("\nLista vazia!");
            return;
        }
        for (Contato c: contatos){
            System.out.println(
            c.getNome() + " - " +
            c.getCelular() + " - " +
            c.getEndereco()
            );
        }     
    }
}