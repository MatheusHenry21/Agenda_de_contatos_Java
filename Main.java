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

            if (opcao == 0){
                break;
            }
        }
    }
}