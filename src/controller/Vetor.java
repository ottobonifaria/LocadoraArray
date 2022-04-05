package controller;
import domain.Veiculos;
import java.util.Arrays;
import java.util.Scanner;
public class Vetor {


    public static final Integer QTD_DE_VEICULOS=10;
    public  Integer veiculosDisponiveis =0;
    Veiculos[] veiculo = new Veiculos[QTD_DE_VEICULOS];


    public void cadastraVeiculo(){
        if(veiculosDisponiveis < QTD_DE_VEICULOS){
            if(veiculo[veiculosDisponiveis] == null) {
                Scanner sc = new Scanner(System.in);
                System.out.println("====> Cadastrando Veiculo NUM : " + (veiculosDisponiveis + 1) + " <====");
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
                veiculo[veiculosDisponiveis] = new Veiculos(marca, modeloVeiculo, cor, placa, valorDaDiaria);
                veiculosDisponiveis++;
            }else{
                System.out.println("Campo já preenchido");
            }
        }else System.out.println("limite de veiculos alcançado");
    }
    public void listarVeiculos(){
        try {
            if (veiculosDisponiveis != 0) {
                for (int i = 0; i < veiculosDisponiveis; i++) {
                    System.out.println("\n========= Veiculo Nun. " + (i + 1) + " =========\n");
                    System.out.println(veiculo[i].toString());
                }
            } else {
                System.out.println("Não Existe Veiculo cadastrado");
            }
        }catch (NullPointerException e){}
    }
    public void ordena(){
        if(veiculosDisponiveis != 0) {
            Arrays.sort(veiculo);
        } else System.out.println("Não Existe Veiculo cadastrado");

    }
}
