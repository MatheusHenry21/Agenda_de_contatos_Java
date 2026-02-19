import java.util.Scanner;

import model.Contato;
import service.Agenda;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        while (true){
            
            System.out.println("\n---MENU---");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Editar contato");
            System.out.println("4 - Deletar contato");
            System.out.println("0 - Sair");

            System.out.print("\nDigite qual item deseja utilizar: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Celular: ");
                    String celular = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    agenda.adicionar(new Contato(nome, celular, endereco));
                    break;
                case 2:
                    agenda.listar();
                    break;
                case 3:
                    //pass
                case 4:
                    //pass
                default:
                    System.out.println("\nOpção inexistente!");
            }
        }
    }
}