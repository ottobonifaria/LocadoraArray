import controller.VeiculoController;
import domain.Veiculo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        //Veiculo[] veiculos = new Veiculo[10];
        VeiculoController veiculoController = new VeiculoController();
        veiculoController.cadastra(); // Pré-cadastra 5 veiculos

        do{
            exibirMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    veiculoController.cadastraVeiculo();
                    break;
                case 2:
                    System.out.println("\n===== FIFTCARS ===== \n Confira nossos modelos\n");
                    System.out.println("=====> LISTA DE VEICULO <=====");
                    veiculoController.listarVeiculos();
                    break;
                case 3:
                    veiculoController.ordena();
                    veiculoController.listarVeiculos();
                    break;
                case 4:
                    System.out.println("=========== LISTA DE VEICULOS DISPONIVEIS ============\n");
                    veiculoController.listaVeiculosDisponiveis();
                    break;
                case 5:
                    veiculoController.aluga();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while(menu !=6);
    }
    static public void exibirMenu() {
        System.out.println("========== LOCADORA ===========");
        System.out.println(" 1 - CADASTRAR");
        System.out.println(" 2 - LISTAR VEICULOS CADASTRADO");
        System.out.println(" 3 - ORDENAR MENOR VALOR");
        System.out.println(" 4 - CONSULTA VEICULA DISPONIVEL PARA ALUGAR");
        System.out.println(" 5 - ALUGA VEICULO");
        System.out.println(" 6 - SAIR");

    }


}
