import controller.Vetor;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        Vetor lista = new Vetor();
        do{
            exibirMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    lista.cadastraVeiculo();
                    break;
                case 2:
                    System.out.println("\n===== FIFTCARS ===== \n Confira nossos modelos\n");
                    System.out.println("=====> LISTA DE VEICULO <=====");
                    lista.listarVeiculos();
                    break;
                case 3:
                    lista.ordena();
                    lista.listarVeiculos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while(menu !=4);
    }
    static public void exibirMenu() {
        System.out.println("========== LOCADORA ===========");
        System.out.println(" 1 - CADASTRAR");
        System.out.println(" 2 - LISTAR");
        System.out.println(" 3 - ORDENAR MENOR VALOR");
        System.out.println(" 4 - SAIR");

    }
}
