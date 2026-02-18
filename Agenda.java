import java.util.ArrayList;

public class Agenda {
    private ArrayList<Model> contatos = new ArrayList<>();

    public void adicionar(Model contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void listar(){
        for (Model c: contatos){
            System.out.println(c.nome + " - " + c.celular);
        }
    }
}