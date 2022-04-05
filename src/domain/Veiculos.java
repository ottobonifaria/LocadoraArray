package domain;

public class Veiculos implements Comparable<Veiculos>{

    private String marca;
    private String modeloVeiculo;
    private String cor;
    private String placa;
    private int valorDaDiaria;

    public Veiculos(String marca, String modeloVeiculo, String cor, String placa,int valorDaDiaria) {
        this.marca = marca;
        this.modeloVeiculo = modeloVeiculo;
        this.cor = cor;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(int valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    @Override
    public String toString() {
        return "Marca ...............: " + marca +
                "\nModelo ..............: " + modeloVeiculo +
                "\nCor .................: " + cor +
                "\nPlaca ...............: " + placa +
                "\nValor da Diária R$ ..: " + valorDaDiaria+"\n";
    }

    @Override
    public int compareTo(Veiculos o) {

        if(this.valorDaDiaria < o.valorDaDiaria){
            return -1;
        }
        if(this.valorDaDiaria > o.valorDaDiaria){
            return 1;
        }
        return 0;
    }
}