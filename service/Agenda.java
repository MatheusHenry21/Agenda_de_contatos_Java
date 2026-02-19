package service;
import java.util.ArrayList;

import model.Contato;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void listar(){
        for (Contato c: contatos){
            System.out.println(c.nome + " - " + c.celular);
        }
    }
}