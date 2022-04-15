package controller;
import domain.Veiculo;
import java.util.Arrays;
import java.util.Scanner;
public class VeiculoController {


    public static final Integer QTD_DE_VEICULOS=5;
    public  int veiculosCadastrados = 0;
    Veiculo[] veiculo = new Veiculo[QTD_DE_VEICULOS];


    public void cadastraVeiculo(){
        if(veiculosCadastrados < QTD_DE_VEICULOS){
            if(veiculo[veiculosCadastrados] == null) {
                Scanner sc = new Scanner(System.in);
                System.out.println("====> Cadastrando Veiculo NUM : " + (veiculosCadastrados + 1) + " <====");
                System.out.println("Digite a marca do veiculo ");
                String marca = sc.next();
                System.out.println("Digite o modelo do veiculo");
                String modeloVeiculo = sc.next();
                System.out.println("Digite a cor do veiculo");
                String cor = sc.next();
                System.out.println("Digite a placa do veiculo");
                String placa = sc.next();
                System.out.println("Digite o valor da Diaria");
                int valorDaDiaria = sc.nextInt();
                boolean alugado = false;
                veiculo[veiculosCadastrados] = new Veiculo(marca, modeloVeiculo, cor, placa, valorDaDiaria,alugado);
                veiculosCadastrados++;
            }else{
                System.out.println("Campo já preenchido");
            }
        }else System.out.println("limite de veiculos alcançado");
    }
    public void listarVeiculos(){
        try {
            if (veiculosCadastrados != 0) {
                for (int i = 0; i < veiculosCadastrados; i++) {
                    System.out.println(" Veiculo: " + (i + 1) + " --> " + veiculo[i].toString());
                }
            } else {
                System.out.println("Não Existe Veiculo cadastrado");
            }
        }catch (NullPointerException e){}
    }
    public void ordena(){
        if(veiculosCadastrados != 0) {
            Arrays.sort(veiculo);
        } else System.out.println("Não Existe Veiculo cadastrado");
    }

    public void listaVeiculosDisponiveis(){

        for (int i = 0; i < veiculosCadastrados; i++) {
            if(veiculo[i].isDisponivel()==false){
                System.out.println( veiculo[i].toString());
            }
        }
    }
    public void aluga(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a placa do veiculo");
        String placa = sc.next();

        for (int i = 0; i < veiculosCadastrados; i++) {
            if(veiculo[i].isDisponivel() == false){
                if(veiculo[i].getPlaca().equals(placa)){
                    veiculo[i].setDisponivel(true);
                }
            }
            System.out.println(veiculo[i].toString());
        }

    }
    public void cadastra() {
        veiculosCadastrados = 5;
        veiculo[0] = new Veiculo("Fiat", "Toro", "Preta", "AAA-1234",
                200, false);
        veiculo[1] = new Veiculo("Toyota", "Hilux", "Prata", "BBB-1234",
                300, false);
        veiculo[2] = new Veiculo("Hyunday", "HB20", "Branca", "CCC-1234",
                100, false);
        veiculo[3] = new Veiculo("Ford", "EcoSport", "Cinza", "DDD-1234",
                150, false);
        veiculo[4] = new Veiculo("VW", "Golf", "Preto", "EEE-1234",
                250, false);
    }
}
