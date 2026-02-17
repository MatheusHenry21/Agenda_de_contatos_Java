import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.print("\nDigite o nome da pessoa: ");
                    String nome = sc.nextLine();

                    System.out.print("\nDigite o celular da pessoa: ");
                    String celular = sc.nextLine();

                    System.out.print("\nDigite o endereço da pessoa(Opcional): ");
                    String endereco = sc.nextLine();

                    Model pessoa1 = new Model(nome, celular, endereco);
                    pessoa1.salvamento();
                case 2:
                    //pass
                case 3:
                    //pass
                case 4:
                    //pass

            }
        }
    }
}